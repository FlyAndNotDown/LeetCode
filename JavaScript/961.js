/**
 * @no 961
 * @name N-Repeated Element in Size 2N Array
 */
let repeatedNTimes = function(a) {
    let count = {};
    let n = parseInt(a.length / 2, 10);
    a.map(number => {
        if (count[number]) {
            count[number] += 1;
        } else {
            count[number] = 1;
        }
    });
    for (let key in count) {
        if (count.hasOwnProperty(key) && count[key] == n) {
            return key;
        }
    }
    return a[0];
};
