/**
 * @no 8
 * @name String to Integer
 */
public class Solution {
    public int myAtoi(String str) {
        double number = 0;
        boolean positive = true;
        boolean haveSymbol = false;
        boolean start = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (start) break;
                else continue;
            }
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (haveSymbol) return 0;
                else {
                    haveSymbol = true;
                    start = true;
                    positive = str.charAt(i) == '+';
                }
                continue;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number= number * 10 + (str.charAt(i) - '0');
                start = true;
            }
            else break;
        }

        number = positive ? number : 0 - number;
        if (number < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if(number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) number;
    }
}
