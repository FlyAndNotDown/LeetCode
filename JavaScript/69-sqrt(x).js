/**
 * @param {number} x
 * @return {number}
 */
let mySqrt = (x) => {
    let i = 0;
    while (i * i < x) i++;
    return i * i === x ? i : i - 1;
};
