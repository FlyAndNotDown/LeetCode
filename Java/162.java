/**
 * @no 162
 * @name Find Peak Element
 */
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 == -1) {
                if (nums[i] > nums[i + 1]) { return i; }
            } else if (i + 1 == nums.length) {
                if (nums[i] > nums[i - 1]) { return i; }
            } else {
                if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) { return i; }
            }
        }
        return 0;
    }
}