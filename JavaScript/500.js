/**
 * @no 500
 * @name Keyboard Row
 */
let findWords = function(words) {
    const map = {
        q: 0, w: 0, e: 0, r: 0, t: 0, y: 0, u: 0, i: 0, o: 0, p: 0,
        a: 1, s: 1, d: 1, f: 1, g: 1, h: 1, j: 1, k: 1, l: 1,
        z: 2, x: 2, c: 2, v: 2, b: 2, n: 2, m: 2
    };
    const result = [];
    words.map(word => {
        if (word.length == 0) { return; }
        const row = map[word[0].toLowerCase()];
        for (let i = 1; i < word.length; i++) {
            if (row !== map[word[i].toLowerCase()]) { return; }
        }
        return result.push(word);
    });
    return result;
};
