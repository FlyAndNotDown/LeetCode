/**
 * @no 63
 * @name Unique Paths II
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int[][] dp = new int[height + 1][width + 1];
        dp[0][1] = 1;
        for (int i = 1; i < height + 1; i++) {
            for (int j = 1; j < width + 1; j++) {
                if (obstacleGrid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[height][width];
    }
}