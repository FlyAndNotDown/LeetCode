/**
 * @no 338
 * @name Counting Bits
 */
const countBits = function(num) {
    if (num === 0) { return [0]; }
    if (num === 1) { return [0, 1]; }
    const result = [0, 1];
    for (let i = 2; i <= num; i++) {
        if (i & 1) {
            result.push(result[i - 1] + 1);
        } else {
            result.push(result[i / 2]);
        }
    }
    return result;
};