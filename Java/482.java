/**
 * @no 482
 * @name License Key Formatting
 */
class Solution {
    public static String licenseKeyFormatting(String s, int k) {
        String source = new StringBuffer(s.replace("-", "").toUpperCase()).reverse().toString();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % k == 0 && i != 0) {
                resultBuilder.append('-');
            }
            resultBuilder.append(source.charAt(i));
        }
        return new StringBuffer(resultBuilder.toString()).reverse().toString();
    }
}