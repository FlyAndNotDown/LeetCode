/**
 * @no 409
 * @name Longest Palindrome
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[58];
        for (char c : s.toCharArray()) {
            map[c - 'A']++;
        }
        int result = 0;
        boolean hasSingle = false;
        for (int count : map) {
            if (count % 2 == 0) {
                result += count;
            } else {
                hasSingle = true;
                result += count > 2 ? count - 1 : 0;
            }
        }
        return hasSingle ? result + 1 : result;
    }
}