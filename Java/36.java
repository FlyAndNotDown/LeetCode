/**
 * @no 36
 * @name Valid Sudoku
 */
class Solution {
    public static boolean isValidSudoku(char[][] board) {
        List<Map<Character, Boolean>> blocks = new ArrayList<>();
        List<Map<Character, Boolean>> rows = new ArrayList<>();
        List<Map<Character, Boolean>> cols = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            blocks.add(new HashMap<>());
            rows.add(new HashMap<>());
            cols.add(new HashMap<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char key = board[i][j];
                if (key == '.') {
                    continue;
                }

                int blockIndex = (i / 3) * 3 + j / 3;
                if (blocks.get(blockIndex).containsKey(key)) {
                    return false;
                } else {
                    blocks.get(blockIndex).put(key, true);
                }

                if (rows.get(i).containsKey(key)) {
                    return false;
                } else {
                    rows.get(i).put(key, true);
                }

                if (cols.get(j).containsKey(key)) {
                    return false;
                } else {
                    cols.get(j).put(key, true);
                }
            }
        }
        return true;
    }
}