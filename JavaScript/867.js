/**
 * @no 867
 * @name Transpose Matrix
 */
let transpose = function(a) {
    if (a.length === 0) { return []; }
    let b = [];
    for (let i = 0; i < a[0].length; i++) {
        let t = [];
        for (let j = 0; j < a.length; j++) {
            t.push(a[j][i]);
        }
        b.push(t);
    }
    return b;
};