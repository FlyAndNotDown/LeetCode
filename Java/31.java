/**
 * @no 31
 * @name Next Permutation
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int mid = nums.length - 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                mid = i - 1;
                break;
            }
        }
        if (mid == nums.length - 1) {
            Arrays.sort(nums);
            return;
        }
        int minIndex = mid + 1;
        int min = nums[minIndex];
        for (int i = mid + 2; i < nums.length; i++) {
            if (nums[i] > nums[mid] && nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        int t = nums[mid];
        nums[mid] = nums[minIndex];
        nums[minIndex] = t;
        Arrays.sort(nums, mid + 1, nums.length);
    }
}