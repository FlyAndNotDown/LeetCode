/**
 * @no 52
 * @name N-Queens II
 */
class Solution {
    private int length;
    private int result;
    private boolean[] recordRow;
    private boolean[] recordCol;
    private boolean[] recordObliquePositive;
    private boolean[] recordObliqueNegative;
    private boolean[][] board;

    public int totalNQueens(int n) {
        length = n;
        result = 0;
        recordRow = new boolean[length];
        recordCol = new boolean[length];
        recordObliquePositive = new boolean[2 * length - 1];
        recordObliqueNegative = new boolean[2 * length - 1];
        board = new boolean[length][length];
        backtrack(0, 0, 0);
        return result;
    }

    private void backtrack(int i, int j, int count) {
        if (count == length) {
            result++;
            return;
        }
        if (i == length) {
            return;
        }

        int positiveIndex = getObliquePositiveIndex(i, j);
        int negativeIndex = getObliqueNegativeIndex(i, j);
        if (!recordObliquePositive[positiveIndex] &&
            !recordObliqueNegative[negativeIndex] &&
            !recordRow[i] && !recordCol[j]) {
            board[i][j] = recordObliquePositive[positiveIndex] = recordObliqueNegative[negativeIndex] =
                recordRow[i] = recordCol[j] = true;
            next(i, j, count + 1);
            board[i][j] = recordObliquePositive[positiveIndex] = recordObliqueNegative[negativeIndex] =
                recordRow[i] = recordCol[j] = false;
        }
        next(i, j, count);
    }

    private void next(int i, int j, int count) {
        if (j == length - 1) {
            backtrack(i + 1, 0, count);
        } else {
            backtrack(i, j + 1, count);
        }
    }

    private int getObliquePositiveIndex(int i, int j) {
        return i + j;
    }

    private  int getObliqueNegativeIndex(int i, int j) {
        return length + j - i - 1;
    }
}