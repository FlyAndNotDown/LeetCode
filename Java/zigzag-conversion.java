public class Solution {
    public String convert(String s, int numRows) {
        // 如果只有一行则不需要转换
        if (numRows == 1) return s;

        // 按照行数建立n个字符串用于存放结果
        String [] res = new String[numRows];
        for (int i = 0; i < numRows; i ++) res[i] = "";

        // 按照z字形开始往字符串中添加元素
        int p = 0, q = 0;
        boolean direction = false;
        while (p < s.length()) {
            res[q] += s.charAt(p);
            if (q == 0) direction = false;
            if (q == numRows - 1) direction = true;
            q = direction ? q - 1 : q + 1;
            p++;
        }

        StringBuffer ans = new StringBuffer("");
        for (String i : res) {
            ans.append(i);
        }

        return ans.toString();
    }
}
