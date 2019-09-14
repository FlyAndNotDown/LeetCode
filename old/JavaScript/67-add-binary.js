/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
let addBinary = (a, b) => {
    if (a.length < b.length) {
        let t = a;
        a = b;
        b = t;
    }

    let ans = '', charA, charB;
    let count = 0;
    for (let i = 0; i < a.length; i++) {
        if (b.length - i > 0) {
            charA = a.charAt(a.length - i - 1);
            charB = b.charAt(b.length - i - 1);
            count = parseInt(charA) + parseInt(charB) + count;
            ans = count % 2 + ans;
            count = Math.floor(count / 2);
        } else {
            charA = a.charAt(a.length - i - 1);
            count = parseInt(charA) + count;
            ans = count % 2 + ans;
            count = Math.floor(count / 2);
        }
    }
    ans = count > 0 ? count + ans : ans;

    return ans;
};
