/**
 * @no 999
 * @name Available Captures for Rook
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        int[] locationOfRook = new int[2];
        int height = board.length;
        int width = board[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == 'R') {
                    locationOfRook[0] = i;
                    locationOfRook[1] = j;
                    break;
                }
            }
        }
        int result = 0;
        for (int i = locationOfRook[0] - 1; i > -1; i--) {
            if (board[i][locationOfRook[1]] == 'B') {
                break;
            }
            if (board[i][locationOfRook[1]] == 'p') {
                result++;
                break;
            }
        }
        for (int i = locationOfRook[0] + 1; i < height; i++) {
            if (board[i][locationOfRook[1]] == 'B') {
                break;
            }
            if (board[i][locationOfRook[1]] == 'p') {
                result++;
                break;
            }
        }
        for (int i = locationOfRook[1] - 1; i > -1; i--) {
            if (board[locationOfRook[0]][i] == 'B') {
                break;
            }
            if (board[locationOfRook[0]][i] == 'p') {
                result++;
                break;
            }
        }
        for (int i = locationOfRook[1] + 1; i < width; i++) {
            if (board[locationOfRook[0]][i] == 'B') {
                break;
            }
            if (board[locationOfRook[0]][i] == 'p') {
                result++;
                break;
            }
        }
        return result;
    }
}