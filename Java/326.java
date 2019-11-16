/**
 * @no 326
 * @name Power of Three
 */
class Solution {
    public static boolean isPowerOfThree(int n) {
        return n == 1 || (n == 3 || (n >= 3 && (n % 3 == 0 && isPowerOfThree(n / 3))));
    }
}