/**
 * @no 695
 * @name Max Area of Island
 */
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        boolean[][] discovered = new boolean[height][width];

        List<int[]> ones = findOnes(grid, height, width);
        int max = 0;
        for (int[] onePosition : ones) {
            if (!discovered[onePosition[0]][onePosition[1]]) {
                max = Math.max(max, traversal(onePosition[0], onePosition[1], grid, height, width, discovered));
            }
        }
        return max;
    }

    private List<int[]> findOnes(int[][] grid, int height, int width) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    result.add(new int[] { i, j });
                }
            }
        }
        return result;
    }

    private int traversal(int i, int j, int[][] grid, int height, int width, boolean[][] discovered) {
        if (discovered[i][j]) {
            return 0;
        }
        discovered[i][j] = true;
        if (grid[i][j] == 0) {
            return 0;
        }
        return 1 +
            (i - 1 > -1 ? traversal(i - 1, j, grid, height, width, discovered) : 0) +
            (i + 1 < height ? traversal(i + 1, j, grid, height, width, discovered) : 0) +
            (j - 1 > -1 ? traversal(i, j - 1, grid, height, width, discovered) : 0) +
            (j + 1 < width ? traversal(i, j + 1, grid, height, width, discovered) : 0);
    }
}