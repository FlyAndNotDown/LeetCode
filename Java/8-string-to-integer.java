public class Solution {
    public int myAtoi(String str) {
        double number = 0;
        boolean positive = true;
        boolean haveSymbol = false;
        boolean start = false;
        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 如果是空格
            if (str.charAt(i) == ' ') {
                if (start) break;
                else continue;
            }
            // 如果是正负号
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (haveSymbol) return 0;
                else {
                    haveSymbol = true;
                    start = true;
                    positive = str.charAt(i) == '+';
                }
                continue;
            }
            // 如果是数字、空格或其他
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number= number * 10 + (str.charAt(i) - '0');
                start = true;
            }
            else break;
        }

        // 转换正负
        number = positive ? number : 0 - number;
        // 判断是否溢出并返回结果
        if (number < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if(number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) number;
    }
}
