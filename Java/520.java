/**
 * @no 520
 * @name Detect Capital
 */
class Solution {
    public static boolean detectCapitalUse(String word) {
        return isAllUpperCase(word) || isAllLowerCase(word) || isStartWithUpperCase(word);
    }

    public static boolean isAllUpperCase(String word) {
        for (char c : word.toCharArray()) {
            if (!(c >= 'A' && c <= 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllLowerCase(String word) {
        for (char c : word.toCharArray()) {
            if (!(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStartWithUpperCase(String word) {
        char[] charArray = word.toCharArray();
        if (!(charArray[0] >= 'A' && charArray[0] <= 'Z')) {
            return false;
        }
        for (int i = 1; i < word.length(); i++) {
            if (!(charArray[i] >= 'a' && charArray[i] <= 'z')) {
                return false;
            }
        }
        return true;
    }
}