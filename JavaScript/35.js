/**
 * @no 35
 * @name Search Insert Position
 */
let searchInsert = (numbers, target) => {
    for (let i = 0; i < numbers.length; i++)
        if (target <= numbers[i]) return i;
    return numbers.length;
};
