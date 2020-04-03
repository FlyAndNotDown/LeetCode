/**
 * @no 80
 * @name Remove Duplicates from Sorted Array II
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;
        boolean start = false;
        int last = -1;
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (start) {
                if (last != nums[i]) {
                    nums[current++] = nums[i];
                    last = nums[i];
                    result++;
                    count = 1;
                } else {
                    if (count < 2) {
                        nums[current++] = nums[i];
                        last = nums[i];
                        result++;
                    }
                    count++;
                }
            } else {
                last = nums[i];
                nums[current++] = nums[i];
                start = true;
                result++;
                count = 1;
            }
        }
        return result;
    }
}