/**
 * @no 556
 * @name Reshape the Matrix
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int row, int col) {
        int oldRow = nums.length;
        int oldCol = nums[0].length;
        if (oldRow * oldCol != row * col) {
            return nums;
        }

        int[][] result = new int[row][col];
        for (int i = 0; i < oldRow; i++) {
            for (int j = 0; j < oldCol; j++) {
                int index = i * oldCol + j;
                result[index / col][index % col] = nums[i][j];
            }
        }
        return result;
    }
}