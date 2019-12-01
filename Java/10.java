/**
 * @no 10
 * @name Regular Expression Matching
 */
class Solution {
    public static boolean isMatch(String source, String pattern) {
        if (pattern.length() == 0) {
            return source.length() == 0;
        } else if (pattern.length() == 1) {
            return source.length() == 1 && (source.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.');
        } else {
            if (pattern.charAt(1) == '*') {
                if (source.length() == 0) {
                    return isMatch(source, pattern.substring(2));
                } else if (source.charAt(0) == pattern.charAt(0)) {
                    return isMatch(source.substring(1), pattern) || isMatch(source, pattern.substring(2));
                } else if (pattern.charAt(0) == '.') {
                    return isMatch(source.substring(1), pattern) || isMatch(source, pattern.substring(2));
                } else {
                    return isMatch(source, pattern.substring(2));
                }
            } else {
                if (source.length() == 0) {
                    return false;
                } if (pattern.charAt(0) == '.') {
                    return isMatch(source.substring(1), pattern.substring(1));
                } else {
                    return pattern.charAt(0) == source.charAt(0) && isMatch(source.substring(1), pattern.substring(1));
                }
            }
        }
    }
}