/**
 * @no 171
 * @name Excel Sheet Column Number
 */
let titleToNumber = function(s) {
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        count = count * 26 + (s.charCodeAt(i) - 'A'.charCodeAt(0) + 1);
    }
    return count;
};
