/**
 * @no 58
 * @name Length of Last Word
 */
var lengthOfLastWord = function(s) {
    let wordReverse = [];
    let start = false;
    for (let i = s.length - 1; i > -1; i--) {
        if (!start && (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z')) {
            start = true;
            wordReverse.push(s[i]);
            continue;
        }
        if (start) {
            if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
                wordReverse.push(s[i]);
            } else break;
        }
    }
    return wordReverse.reverse().join('').length;
};
