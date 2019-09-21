/**
 * @no 1089
 * @name Duplicate Zeros
 */
const insert = function(array, position, value) {
    for (let i = array.length - 2; i >= position; i--) {
        array[i + 1] = array[i];
    }
    array[position] = value;
}

const duplicateZeros = function(array) {
    let i = 0;
    while (i < array.length) {
        if (array[i] === 0) {
            insert(array, i++, 0);
        }
        i++;
    }
};
