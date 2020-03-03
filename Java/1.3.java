/**
 * @no 1.3
 * @name String to URL LCCI
 */
class Solution {
    public String replaceSpaces(String s, int length) {
        int spaceNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < length && s.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        char[] chars = new char[length + spaceNum * 2];
        int i = length + spaceNum * 2 - 1;
        int j = length - 1;
        while (j > -1) {
            if (s.charAt(j) == ' ') {
                chars[i - 2] = '%';
                chars[i - 1] = '2';
                chars[i] = '0';
                i -= 3;
            } else {
                chars[i] = s.charAt(j);
                i--;
            }
            j--;
        }
        return String.valueOf(chars);
    }
}