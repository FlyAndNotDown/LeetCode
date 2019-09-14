/**
 * @no 14
 * @name Longest Common Prefix
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int p = 0;
        char tmp;
        boolean end = false;
        while (true) {
            if (p >= strs[0].length()) break;
            tmp = strs[0].charAt(p);
            for (int i = 1; i < strs.length; i++) {
                if (p >= strs[i].length() || tmp != strs[i].charAt(p)) {
                    end = true;
                    break;
                }
            }
            if (end) break; else p++;
        }
        return strs[0].substring(0, p);
    }
}
