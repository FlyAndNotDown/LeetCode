/**
 * @no 1.2
 * @name Check Permutation LCCI
 */
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] a = new int[64];
        int[] b = new int[64];
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a'] += 1;
            b[s2.charAt(i) - 'a'] += 1;
        }
        return Arrays.compare(a, b) == 0;
    }
}