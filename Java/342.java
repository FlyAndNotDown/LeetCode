/**
 * @no 342
 * @name Power of Four
 */
class Solution {
    public static boolean isPowerOfFour(int n) {
        return n == 1 || (n == 4 || (n >= 4 && (n % 4 == 0 && isPowerOfFour(n / 4))));
    }
}