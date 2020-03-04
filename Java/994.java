/**
 * @no 994
 * @name Rotting Oranges
 */
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Integer[]> queue = new LinkedList<>();
        int height = grid.length;
        int width = grid[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Integer[] { i, j, 1 });
                }
            }
        }
        int time = 0;
        while (!queue.isEmpty()) {
            Integer[] location = queue.poll();
            int i = location[0];
            int j = location[1];
            if (i - 1 > -1 && grid[i - 1][j] == 1) {
                time = location[2];
                grid[i - 1][j] = 2;
                queue.offer(new Integer[] { i - 1, j, time + 1 });
            }
            if (i + 1 < height && grid[i + 1][j] == 1) {
                time = location[2];
                grid[i + 1][j] = 2;
                queue.offer(new Integer[] { i + 1, j, time + 1 });
            }
            if (j - 1 > -1 && grid[i][j - 1] == 1) {
                time = location[2];
                grid[i][j - 1] = 2;
                queue.offer(new Integer[] { i, j - 1, time + 1 });
            }
            if (j + 1 < width && grid[i][j + 1] == 1) {
                time = location[2];
                grid[i][j + 1] = 2;
                queue.offer(new Integer[] { i, j + 1, time + 1 });
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}