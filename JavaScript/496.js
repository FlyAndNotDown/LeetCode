/**
 * @no 496
 * @name Next Greater Element I
 */
const nextGreaterElement = function(nums1, nums2) {
    const result = [];
    nums1.forEach(number => {
        let start = false, find = false;
        for (let i = 0; i < nums2.length; i++) {
            if (start && nums2[i] > number) {
                result.push(nums2[i]);
                find = true;
                break;
            }
            if (number === nums2[i]) { start = true; }
        }
        if (!find) { result.push(-1); }
    });
    return result;
};
