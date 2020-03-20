/**
 * @no 287
 * @name Find the Duplicate Number
 */
class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            boolean find = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    if (find) {
                        return i;
                    } else {
                        find = true;
                    }
                }
            }
        }
        return nums[0];
    }
}