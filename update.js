let fs = require('fs');

let config = {
    tableStartString: '## 详情',
    outputFile: './README.md',
    languages: [{
        name: 'Java',
        type: 'java'
    }, {
        name: 'JavaScript',
        type: 'js'
    }, {
        name: 'Python',
        type: 'py'
    }, {
        name: 'C++',
        type: 'cpp'
    }]
};

fs.readFile(config.outputFile, (err, data) => {
    if (err) return console.log(err);

    // 去掉原来画的表
    data = data.toString();
    data = data.substring(0, data.indexOf(config.tableStartString) + config.tableStartString.length);
    data += '\n';

    let list = [];
    config.languages.forEach((language) => {
        // 依次所有语言目录下的文件
        fs.readdirSync(`./${language.name}/`).forEach((file) => {
            // 获取文件编号和文件名
            let id = file.split('-')[0];
            let tmp = file.replace(id, '').replace(`.${language.type}`, ''), name = '';
            for (let i = 0; i < tmp.length; i++)
                name += tmp[i] === '-' ? ' ' + tmp[i++ + 1].toUpperCase() : tmp[i];
            name = name.substring(1, name.length);
            // 在列表中查找有没有相同编号
            let find = false;
            let key;
            for (let i = 0; i < list.length; i++) {
                if (list[i].id === id) {
                    find = true;
                    key = i;
                    break;
                }
            }
            if (find) {
                list[key].languages.push({
                    name: language.name,
                    path: `./${language.name}/${file}`
                });
            } else {
                list.push({
                    id: id,
                    name: name,
                    languages: [{
                        name: language.name,
                        path: `./${language.name}/${file}`
                    }]
                });
            }
        });
    });

    // 统计信息
    data += '| 统计信息键 | 值 |\n';
    data += '| :- | :- |\n';
    data += `| AC的题目总数 | ${list.length} |\n\n`;

    // 画表头
    data += '| 编号 | 题目名 | 完成语言 |\n';
    data += '| :- | :- | :- |\n';

    // 根据 list 画表
    list.sort((a, b) => parseInt(a.id) > parseInt(b.id) ? 1 : -1);
    list.forEach((item) => {
        data += `| ${item.id} | ${item.name} | `;
        item.languages.forEach((language) => {
            data += `[${language.name}](${language.path}) `;
        });
        data += '|\n';
    });

    fs.writeFile(config.outputFile, data, (err) => {
        if (err) return console.log(err);
    });
});
