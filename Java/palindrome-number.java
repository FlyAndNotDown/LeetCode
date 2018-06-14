package pers.kindem.leetcode.java.solution.PalindromeNumber9;

public class Solution {
    public boolean isPalindrome(int x) {
        // 如果x是负整数
        if (x < 0) return false;
        // 如果x是0
        else if (x == 0) return true;
        else {
            int backup = x;
            int y = 0;
            while (x != 0) {
                y = y * 10 + x % 10;
                x = x / 10;
            }
            return (y == backup);
        }
    }
}