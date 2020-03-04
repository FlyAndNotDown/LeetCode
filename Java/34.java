/**
 * @no 34
 * @name Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };
        if (nums.length == 0) { return result; }
        int index = binarySearch(nums, 0, nums.length - 1, target);
        if (index == -1) { return result; }

        result[0] = getFarLeft(nums, index, target);
        result[1] = getFarRight(nums, index, target);
        return result;
    }

    private int getFarLeft(int[] nums, int right, int target) {
        if (right - 1 > -1 && nums[right - 1] == target) {
            return getFarLeft(nums, right - 1, target);
        } else {
            return right;
        }
    }

    private int getFarRight(int[] nums, int left, int target) {
        if (left + 1 < nums.length && nums[left + 1] == target) {
            return getFarRight(nums, left + 1, target);
        } else {
            return left;
        }
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        if (left == right) {
            return target == nums[left] ? left : -1;
        }
        int center = (left + right) / 2;
        if (target == nums[center]) {
            return center;
        } else if (target > nums[center]) {
            return binarySearch(nums, center + 1, right, target);
        } else {
            return binarySearch(nums, left, center, target);
        }
    }
}