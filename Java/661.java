/**
 * @no 661
 * @name Image Smoother
 */
class Solution {
    public int[][] imageSmoother(int[][] m) {
        int height = m.length;
        if (height == 0) {
            return new int[][] {};
        }
        int width = m[0].length;
        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            System.arraycopy(m[i], 0, result[i], 0, width);
        }

        int[] directionX = new int[] { -1, 0, 1 };
        int[] directionY = new int[] { -1, 0, 1 };
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int count = 0;
                int sum = 0;
                for (int p = 0; p < directionX.length; p++) {
                    for (int q = 0; q < directionY.length; q++) {
                        int indexX = i + directionX[p];
                        int indexY = j + directionY[q];
                        if (indexX > -1 && indexX < height && indexY > -1 && indexY < width) {
                            count++;
                            sum += m[indexX][indexY];
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}