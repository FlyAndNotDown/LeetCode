/**
 * @no 892
 * @name Surface Area of 3D Shapes
 */
class Solution {
    public int surfaceArea(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int result = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = grid[i][j];
                result +=  value == 0 ? 0 : 2;
                result += i - 1 > -1 ? (value <= grid[i - 1][j] ? 0 : value - grid[i - 1][j]) : value;
                result += i + 1 < height ? (value <= grid[i + 1][j] ? 0 : value - grid[i + 1][j]) : value;
                result += j - 1 > -1 ? (value <= grid[i][j - 1] ? 0 : value - grid[i][j - 1]) : value;
                result += j + 1 < width ? (value <= grid[i][j + 1] ? 0 : value - grid[i][j + 1]) : value;
            }
        }
        return result;
    }
}