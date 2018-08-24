/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
let merge = (nums1, m, nums2, n) => {
    for (let k = 0; k < n; k++) {
        let find = false;
        for (let i = 0; i < m + k; i++) {
            if (nums2[k] <= nums1[i]) {
                for (let j = m + k; j > i; j--)
                    nums1[j] = nums1[j - 1];
                nums1[i] = nums2[k];
                find = true;
                break;
            }
        }
        if (!find) {
            nums1[m + k] = nums2[k];
        }
    }
};
