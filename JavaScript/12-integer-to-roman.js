/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    const integers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    const romans = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'];

    let result = [];
    while (num > 0) {
        for (let i = 0; i < integers.length; i++) {
            if (num >= integers[i]) {
                num -= integers[i];
                result.push(romans[i]);
                break;
            }
        }
    }

    return result.join('');
};

// console.log(intToRoman(1994));