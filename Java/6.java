/**
 * @no 6
 * @name Zigzag Conversion
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String [] res = new String[numRows];
        for (int i = 0; i < numRows; i ++) res[i] = "";

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
