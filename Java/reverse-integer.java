package pers.kindem.leetcode.java.solution.ReverseInteger7;

public class Solution {
    public int reverse(int x) {
        long a = (long) x;
        if (a == 0) return 0;
        StringBuilder str = new StringBuilder("");
        // 如果是负数，添加一个符号
        if (a < 0) {
            str.append('-');
            a = 0 - a;
        }

        // 开始转换
        while (a != 0) {
            str.append(a % 10);
            a = a / 10;
        }

        // 转换之后看是否溢出
        long ans = Long.parseLong(str.toString());
        return ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE ? (int) ans : 0;
    }
}
