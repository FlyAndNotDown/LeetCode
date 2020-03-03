/**
 * @no 1.6
 * @name Compress String LCCI
 */
class Solution {
    public String compressString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char last = '\0';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != last) {
                if (last != '\0') {
                    stringBuilder.append(String.format("%c%d", last, count));
                }
                last = s.charAt(i);
                count = 0;
            }
            count++;
        }
        if (last != '\0') {
            stringBuilder.append(String.format("%c%d", last, count));
        }
        String result = stringBuilder.toString();
        return result.length() >= s.length() ? s : result;
    }
}