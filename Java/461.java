/**
 * @no 461
 * @name Hamming Distance
 */
class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                distance++;
            }
            x /= 2;
            y /= 2;
        }
        return distance;
    }
}