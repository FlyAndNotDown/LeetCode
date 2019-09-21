/**
 * @no 191
 * @name Number of 1 Bits
 */
const hammingWeight = function(n) {
    let result = 0;
    while (n > 0) {
        result += n & 1;
        n >>>= 1;
    }
    return result;
};
