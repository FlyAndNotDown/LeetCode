/**
 * @no 198
 * @name House Robber
 */
class Solution {
    public int rob(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            int maxBefore = 0;
            for (int j = 0; j < i - 1; j++) {
                if (dp[j] > maxBefore) {
                    maxBefore = dp[j];
                }
            }
            dp[i] = maxBefore + nums[i - 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}