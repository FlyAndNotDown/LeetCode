/**
 * @param {number[]} digits
 * @return {number[]}
 */
let plusOne = (digits) => {
    let count = 0;
    for (let i = digits.length - 1; i >= 0; i--) {
        if (i === digits.length - 1) {
            count = digits[i] + 1;
            digits[i] = count % 10;
            count = Math.floor(count / 10);
        }
        else {
            count = digits[i] + count;
            digits[i] = count % 10;
            count = Math.floor(count / 10);
        }
    }
    if (count > 0) digits.unshift(count);
    return digits;
};
