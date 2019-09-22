/**
 * @no 1160
 * @name Find Words That Can Be Formed by Characters
 */
const countCharacters = function(words, chars) {
    const count = [];
    for (let i = 0; i < 26; i++) { count.push(0); }
    for (let i = 0; i < chars.length; i++) {
        count[chars.charCodeAt(i) - 'a'.charCodeAt(0)] += 1;
    }

    let result = 0;
    words.forEach(word => {
        const lCount = [];
        count.forEach(c => { lCount.push(c); });
        for (let i = 0; i < word.length; i++) {
            lCount[word.charCodeAt(i) - 'a'.charCodeAt(0)] -= 1;
            if (lCount[word.charCodeAt(i) - 'a'.charCodeAt(0)] < 0) { return; }
        }
        return result += word.length;
    });
    return result;
};

console.log(countCharacters(["cat","bt","hat","tree"], "atach"));
