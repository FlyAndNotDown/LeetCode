/**
 * @no 45
 * @name Jump Game II
 */
class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int nextEnd = 0;
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            if (end >= nums.length - 1) {
                return times;
            }
            nextEnd = Math.max(nextEnd, i + nums[i]);
            if (i == end) {
                times++;
                end = nextEnd;
            }
        }
        return times;
    }
}