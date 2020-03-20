/**
 * @no 74
 * @name Search a 2D Matrix
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int i = 0;
        while (i < height) {
            if (width - 1 >= 0 && target <= matrix[i][width - 1]) {
                return binarySearch(matrix[i], target) > -1;
            }
            i++;
        }
        return false;
    }

    private int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > array[mid]) {
                left = mid + 1;
            } else if (target < array[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}