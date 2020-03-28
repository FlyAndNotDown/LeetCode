/**
 * @no 17.16
 * @name The Masseuse LCCI
 */
class Solution {
    public int massage(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int max = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                dp[i] = Math.max(dp[j], dp[i]);
            }
            dp[i] += nums[i - 1];
            max = Math.max(dp[i], max);
        }
        return max;
    }
}