/**
 * @param {number} n
 * @return {string}
 */
let countAndSay = (n) => {
    if (n === 1) return '1';
    else {
        let ans = '', char = '', count = 0;
        let old = countAndSay(n - 1);
        for (let i = 0; i < old.length; i++) {
            if (old[i] === char) {
                count++;
            } else {
                ans += count > 0 ? `${count}${char}` : '';
                count = 1;
                char = old[i];
            }
        }
        return `${ans}${count > 0 ? `${count}${char}` : ''}`
    }
};
