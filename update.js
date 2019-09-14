const fs = require('fs');

const config = {
    languages: [{
        name: 'C++',
        folder: 'Cpp',
        format: 'hpp'
    }, {
        name: 'Java',
        folder: 'Java',
        format: 'java'
    }, {
        name: 'JavaScript',
        folder: 'JavaScript',
        format: 'js'
    }, {
        name: 'Python',
        folder: 'Python',
        format: 'py'
    }],
    readmeHeaderFile: './README.header.md',
    readmeFile: './README.md'
};

function getValue(line) {
    let tmps = line.split(' ');
    let result = '';
    for (let i = 1; i < tmps.length; i++) {
        result += i == tmps.length - 1 ? `${tmps[i]}` : `${tmps[i]} `;
    }
    return result;
}

function readMetaInfo(path) {
    let content = fs.readFileSync(path).toString();
    let lines = content.replace(/\r/g, '').split('\n');
    return {
        no: getValue(lines[1].split('@')[1]),
        name: getValue(lines[2].split('@')[1])
    }
}

function buildHeader() {
    return fs.readFileSync(config.readmeHeaderFile);
}

function buildCatalogue() {
    let metaInfos = [];
    config.languages.map(language => {
        let temp = {
            language: language.name,
            format: language.format,
            children: []
        };
        let files = fs.readdirSync(`./${language.folder}`);
        files.map(file => {
            temp.children.push(readMetaInfo(`./${language.folder}/${file}`));
        });
        temp.children.sort((a, b) => {
            return parseInt(a.no, 10) - parseInt(b.no, 10);
        });
        metaInfos.push(temp);
    });

    let count = 0;
    metaInfos.forEach(obj => { obj.children.forEach(child => count++); });

    let result = '| 统计 | 值 |\r\n| - | - |\r\n';
    result += `| AC 的题目总数 | ${count} |\r\n\r\n`;
    metaInfos.forEach(obj => {
        result += `\`${obj.language}\` :\r\n| 编号 | 题目名 | 操作 |\r\n| - | - | - |\r\n`;
        obj.children.forEach(child => {
            result += `| ${child.no} | ${child.name} | [传送门](./${obj.folder}/${child.no}.${obj.format}) |\r\n`;
        });
        result += '\r\n';
    });
    result += '\r\n';
    return result;
}

function exportReadme(header, catelogue) {
    fs.writeFileSync(config.readmeFile, header + catelogue);
}

(function() {
    let header = buildHeader();
    let catelogue = buildCatalogue();
    exportReadme(header, catelogue);
})(); 