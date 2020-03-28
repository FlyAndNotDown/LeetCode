/**
 * @no 41
 * @name First Missing Positive
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean findOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                findOne = true;
            }
            if (nums[i] < 1 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        if (!findOne) { return 1; }

        for (int i = 0; i < nums.length; i++) {
            int number = nums[Math.abs(nums[i]) - 1];
            if (number > 0) {
                nums[Math.abs(nums[i]) - 1] = 0 - number;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}