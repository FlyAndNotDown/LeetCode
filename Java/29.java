/**
 * @no 29
 * @name Divide Two Integers
 */
class Solution {
    public int divide(int dividend, int divisor) {
        long dividendLong = dividend;
        long divisorLong = divisor;
        long result = dividendLong / divisorLong;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) result;
        }
    }
}