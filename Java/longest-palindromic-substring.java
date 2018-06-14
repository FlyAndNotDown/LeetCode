package pers.kindem.leetcode.java.solution.LongestPalindromicSubstring5;

public class Solution {
    public String longestPalindrome(String s) {
        int length = 0;
        String ans = "";

        int p, q;
        // 遍历所有字符，分别以他们作为核，看最大能生长到多长
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
        // 两个字符为单位作为核，再一次看最大能生长到多长
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
