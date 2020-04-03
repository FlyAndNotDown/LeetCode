/**
 * @no 289
 * @name Game of Life
 */
class Solution {
    public void gameOfLife(int[][] board) {
        if (board.length == 0) {
            return;
        }
        final int[][] locationArray = new int[][] {
            { -1, -1 }, { -1, 0 }, { -1, 1 },
            { 0, -1 }, { 0, 1 },
            { 1, -1 }, { 1, 0 }, { 1, 1 }
        };
        int height = board.length;
        int width = board[0].length;
        int[][] newBoard = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                newBoard[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int alive = 0;
                for (int k = 0; k < locationArray.length; k++) {
                    int x = i + locationArray[k][0];
                    int y = j + locationArray[k][1];
                    if (x > -1 && x < height && y > -1 && y < width) {
                        alive += board[x][y] == 1 ? 1 : 0;
                    }
                }
                if (board[i][j] == 1) {
                    if (alive < 2) {
                        newBoard[i][j] = 0;
                    } else if (alive > 3) {
                        newBoard[i][j] = 0;
                    }
                } else {
                    if (alive == 3) {
                        newBoard[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }
}