/**
 * @no 1013
 * @name Partition Array Into Three Parts With Equal Sum
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] a) {
        if (a.length < 3) {
            return false;
        }

        int sumLeft = a[0];
        int sumMid = 0;
        int sumRight = a[a.length - 1];
        for (int k = 1; k <= a.length - 2; k++) {
            sumMid += a[k];
        }
        int sum = sumLeft + sumMid + sumRight;
        int result = sum / 3;
        if (sum % 3 != 0) {
            return false;
        }

        int i = 0;
        int j = a.length - 1;
        while (i < j - 1) {
            if (sumLeft == result && sumRight == result) {
                return true;
            }
            if (sumLeft != result) {
                sumLeft += a[++i];
            }
            if (sumRight != result) {
                sumRight += a[--j];
            }
        }
        return false;
    }
}