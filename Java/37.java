/**
 * @no 37
 * @name Sudoku Solver
 */
class Solution {
    private boolean[][] rowRecord = new boolean[9][9];
    private boolean[][] colRecord = new boolean[9][9];
    private boolean[][] blockRecord = new boolean[9][9];
    private boolean solved = false;

    public void solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    int number = board[row][col] - '1';
                    rowRecord[row][number] = true;
                    colRecord[col][number] = true;
                    blockRecord[row / 3 * 3 + col / 3][number] = true;
                }
            }
        }
        dfs(board, 0, 0);
    }

    private void next(char[][] board, int row, int col) {
        if (col == 8) {
            dfs(board, row + 1, 0);
        } else {
            dfs(board, row, col + 1);
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if (row == 9) {
            solved = true;
            return;
        }
        if (board[row][col] != '.') {
            next(board, row, col);
        } else {
            int block = row / 3 * 3 + col / 3;
            for (int i = 0; i < 9; i++) {
                if (rowRecord[row][i] || colRecord[col][i] || blockRecord[block][i]) {
                    continue;
                }
                board[row][col] = (char) (i + '1');
                rowRecord[row][i] = true;
                colRecord[col][i] = true;
                blockRecord[block][i] = true;
                next(board, row, col);
                if (!solved) {
                    board[row][col] = '.';
                    rowRecord[row][i] = false;
                    colRecord[col][i] = false;
                    blockRecord[block][i] = false;
                }
            }
        }
    }
}