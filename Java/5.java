/**
 * @no 5
 * @name Longest Palindromic Substring
 */
public class Solution {
    public String longestPalindrome(String s) {
        int length = 0;
        String ans = "";

        int p, q;

        for (int i = 0; i < s.length(); i++) {
            p = i - 1;
            q = i + 1;
            while (p >= 0 && q < s.length()) {
                if (s.charAt(p) == s.charAt(q)) {
                    p--;
                    q++;
                } else break;
            }
            if (length < q - p - 1) {
                length = q - p - 1;
                ans = s.substring(p + 1, q);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            p = i;
            q = i + 1;
            while (p >= 0 && q < s.length()) {
                if (s.charAt(p) == s.charAt(q)) {
                    p--;
                    q++;
                } else break;
            }
            if (length < q - p - 1) {
                length = q - p - 1;
                ans = s.substring(p + 1, q);
            }
        }
        return ans;
    }
}
