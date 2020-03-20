/**
 * @no 79
 * @name Word Search
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        int height = board.length;
        if (height == 0) {
            return false;
        }
        int width = board[0].length;
        boolean[][] used = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (dfs(i, j, height, width, board, used, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int height, int width, char[][] board, boolean[][] used, String word, int current) {
        if (current >= word.length()) {
            return true;
        }
        if (used[i][j]) {
            return false;
        }
        if (word.charAt(current) == board[i][j]) {
            if (current == word.length() - 1) {
                return true;
            }
            used[i][j] = true;
            boolean result = i - 1 > -1 && dfs(i - 1, j, height, width, board, used, word, current + 1) ||
                    i + 1 < height && dfs(i + 1, j, height, width, board, used, word, current + 1) ||
                    j - 1 > -1 && dfs(i, j - 1, height, width, board, used, word, current + 1) ||
                    j + 1 < width && dfs(i, j + 1, height, width, board, used, word, current + 1);
            used[i][j] = false;
            return result;
        }
        return false;
    }
}