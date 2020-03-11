/**
 * @no 10.1
 * @name Sorted Merge LCCI
 */
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            if (i >= m + j) {
                a[i] = b[j];
                j++;
            } else {
                if (b[j] < a[i]) {
                    for (int k = m + j; k >= i + 1; k--) {
                        a[k] = a[k - 1];
                    }
                    a[i] = b[j];
                    j++;
                }
            }
            i++;
        }
    }
}