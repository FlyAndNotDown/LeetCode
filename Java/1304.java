/**
 * @no 1304
 * @name Find N Unique Integers Sum up to Zero
 */
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i % 2 == 0 ? i / 2 + 1 : -(i / 2 + 1);
        }
        if (n % 2 == 1) {
            result[n - 1] = 0;
        }
        return result;
    }
}