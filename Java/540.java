/**
 * @no 540
 * @name Single Element in a Sorted Array
 */
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            if (i * 2 + 1 >= nums.length || nums[i * 2] != nums[i * 2 + 1]) {
                return nums[i * 2];
            }
        }
        return nums[nums.length - 1];
    }
}