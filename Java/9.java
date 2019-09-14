/**
 * @no 9
 * @name Palindrome Number
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
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
