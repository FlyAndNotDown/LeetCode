/**
 * @no 81
 * @name Search in Rotated Sorted Array II
 */
class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        int point = 0;
        while (point < nums.length - 1) {
            if (nums[point + 1] < nums[point]) {
                break;
            }
            point++;
        }
        if (target > nums[0]) {
            return binarySearch(nums, target, 0, point);
        } else if (target < nums[0]) {
            return binarySearch(nums, target, point + 1, nums.length - 1);
        } else {
            return true;
        }
    }

    private boolean binarySearch(int[] nums, int target, int start, int end) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}