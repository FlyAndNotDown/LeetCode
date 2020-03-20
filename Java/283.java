/**
 * @no 283
 * @name Move Zeroes
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int numOfZero = 0;
        for (int i = 0; i < nums.length && i + numOfZero < nums.length;) {
            if (nums[i] == 0) {
                numOfZero++;
                for (int j = i; j < nums.length - 1; j++) {
                    swap(nums, j, j + 1);
                }
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}