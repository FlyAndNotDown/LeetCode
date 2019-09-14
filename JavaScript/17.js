/**
 * @no 17
 * @name Letter Conbinations of a Phone Number
 */
var letterCombinations = (digits) => {
    var ans = [];
    var dict = [
        [],
        ['a', 'b', 'c'],
        ['d', 'e', 'f'],
        ['g', 'h', 'i'],
        ['j', 'k', 'l'],
        ['m', 'n', 'o'],
        ['p', 'q', 'r', 's'],
        ['t', 'u', 'v'],
        ['w', 'x', 'y', 'z']
    ];
    digits.replace('1', '');
    for (let i = 0; i < digits.length; i++) {
        if (i === 0) {
            dict[parseInt(digits[i]) - 1].forEach((item) => {
                ans.push(item);
            });
        } else {
            ans = getCartesianProductOfTwoArray(ans, dict[parseInt(digits[i]) - 1]);
        }
    }
    return ans;
};

let getCartesianProductOfTwoArray = (a, b) => {
    let ans = [];
    a.map((ta) => {
        b.map((tb) => {
            ans.push(`${ta}${tb}`);
        });
    });
    return ans;
};
