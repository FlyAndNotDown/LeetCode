/**
 * @no 51
 * @name N-Queens
 */
class Solution {
    private int length;
    private List<List<String>> result;
    private boolean[] recordRow;
    private boolean[] recordCol;
    private boolean[] recordObliquePositive;
    private boolean[] recordObliqueNegative;
    private boolean[][] board;

    public List<List<String>> solveNQueens(int n) {
        length = n;
        result = new ArrayList<>();
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
            result.add(saveResult());
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

    private List<String> saveResult() {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < length; j++) {
                stringBuilder.append(board[i][j] ? 'Q' : '.');
            }
            temp.add(stringBuilder.toString());
        }
        return temp;
    }

    private int getObliquePositiveIndex(int i, int j) {
        return i + j;
    }

    private  int getObliqueNegativeIndex(int i, int j) {
        return length + j - i - 1;
    }
}