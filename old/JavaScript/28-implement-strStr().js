/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if (!needle || needle.length === 0) { return 0; }
    if (!haystack || haystack.length === 0) { return -1; }
    
    let i = 0, j;
    while (i < haystack.length) {
        j = 0;
        while (haystack[i] === needle[j] && i < haystack.length && j < needle.length) {
            i++;
            j++;
        }
        if (j === needle.length) {
            return i - j;
        } else {
            i -= j - 1;
        }
    }

    return -1;
};
