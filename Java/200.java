/**
 * @no 200
 * @name Number of Islands
 */
class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int result = 0;
        int height = grid.length;
        int width = grid[0].length;
        boolean[][] mark = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1' && !mark[i][j]) {
                    dfs(grid, mark, height, width, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, boolean[][] mark, int height, int width, int i, int j) {
        if (i - 1 > -1 && grid[i - 1][j] == '1' && !mark[i - 1][j]) {
            mark[i - 1][j] = true;
            dfs(grid, mark, height, width, i - 1, j);
        }
        if (i + 1 < height && grid[i + 1][j] == '1' && !mark[i + 1][j]) {
            mark[i + 1][j] = true;
            dfs(grid, mark, height, width, i + 1, j);
        }
        if (j - 1 > -1 && grid[i][j - 1] == '1' && !mark[i][j - 1]) {
            mark[i][j - 1] = true;
            dfs(grid, mark, height, width, i, j - 1);
        }
        if (j + 1 < width && grid[i][j + 1] == '1' && !mark[i][j + 1]) {
            mark[i][j + 1] = true;
            dfs(grid, mark, height, width, i, j + 1);
        }
    }
}