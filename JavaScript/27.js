/**
 * @no 27
 * @name Remove Element
 */
var removeElement = function(nums, val) {
    let count = 0;
    for (let i = nums.length - 1; i > -1; i--) {
        if (nums[i] === val) {
            let t = nums[nums.length - 1 - count];
            nums[nums.length - 1 - count] = nums[i];
            nums[i] = t;
            count++;
        }
    }
    return nums.length - count;
};