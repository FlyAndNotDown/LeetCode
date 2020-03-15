/**
 * @no 1071
 * @name Greatest Common Divisor of Strings
 */
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String longStr = str1.length() > str2.length() ? str1 : str2;
        String shortStr = str1.length() > str2.length() ? str2 : str1;
        List<Integer> factors = new ArrayList<>();
        for (int i = shortStr.length(); i > 0; i--) {
            if (shortStr.length() % i == 0 &&
                longStr.length() % i == 0) {
                factors.add(i);
            }
        }

        FOR1:
        for (int factor : factors) {
            for (int i = 0; i < shortStr.length(); i++) {
                if (shortStr.charAt(i) != shortStr.charAt(i % factor)) {
                    continue FOR1;
                }
            }
            for (int i = 0; i < longStr.length(); i++) {
                if (longStr.charAt(i) != shortStr.charAt(i % factor)) {
                    continue FOR1;
                }
            }
            return shortStr.substring(0, factor);
        }
        return "";
    }
}