let maxSubArray = (nums) => {
    let evaluation = [];
    nums.forEach((num, key) => {
        if (key === 0) evaluation.push(num);
        else {
            evaluation.push(Math.max(evaluation[key - 1] + num, num));
        }
    });
    let max = evaluation[0];
    evaluation.forEach((item) => {
        if (item > max) max = item;
    });
    return max;
};
