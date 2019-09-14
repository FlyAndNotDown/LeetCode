/**
 * @no 7
 * @name Reverse Integer
 */
public class Solution {
    public int reverse(int x) {
        long a = (long) x;
        if (a == 0) return 0;
        StringBuilder str = new StringBuilder("");
        
        if (a < 0) {
            str.append('-');
            a = 0 - a;
        }

        while (a != 0) {
            str.append(a % 10);
            a = a / 10;
        }

        long ans = Long.parseLong(str.toString());
        return ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE ? (int) ans : 0;
    }
}
