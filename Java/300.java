/**
 * @no 300
 * @name Longest Increasing Subsequence
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int[] dp = new int[nums.length];
        int result = 1;
        dp[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            int max = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
            result = Math.max(max, result);
        }
        return result;
    }
}