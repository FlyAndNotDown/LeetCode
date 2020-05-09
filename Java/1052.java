/**
 * @no 1052
 * @name Grumpy Bookstore Owner
 */
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        int base = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }
        int left = 0;
        int right = x - 1;
        for (int i = left; i < right + 1; i++) {
            if (grumpy[i] == 1) {
                base += customers[i];
            }
        }
        int max = base;
        while (right + 1 < grumpy.length) {
            if (grumpy[left] == 1) {
                base -= customers[left];
            }
            if (grumpy[right + 1] == 1) {
                base += customers[right + 1];
            }
            max = Math.max(max, base);
            left++;
            right++;
        }
        return max;
    }
}