let generate = (numRows) => {
    if (numRows < 1) return [];
    let result = [];
    for (let i = 0; i < numRows; i++)
        result.push(i === 0 ? [1] : (() => {
            let temp = [];
            for (let j = 0; j < i + 1; j++) temp.push(j === 0 || j === i ? 1 : result[i - 1][j - 1] + result[i - 1][j]);
            return temp;
        })());
    return result;
};
