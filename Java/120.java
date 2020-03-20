/**
 * @no 120
 * @name Triangle
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int level = triangle.size();
        int length = triangle.get(level - 1).size();
        int[][] dp = new int[level + 1][length + 1];
        for (int i = 1; i < level + 1; i++) {
            for (int j = 0; j < level - i + 1; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + triangle.get(level - i).get(j);
            }
        }
        return dp[level][0];
    }
}