/**
 * @no 1.5
 * @name One Away LCCI
 */
class Solution {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        if (first.length() == second.length()) {
            return compareInternal(first, second);
        }
        return first.length() >= second.length() ?
            oneEditAwayInternal(first, second) :
            oneEditAwayInternal(second, first);
    }

    private boolean compareInternal(String first, String second) {
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (++count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean oneEditAwayInternal(String longer, String shorter) {
        boolean jump = false;
        if (shorter.isEmpty()) {
            return true;
        }
        for (int i = 0; i < shorter.length(); i++) {
            if (jump) {
                if (longer.charAt(i) != shorter.charAt(i - 1)) {
                    return false;
                }
            } else {
                if (longer.charAt(i) != shorter.charAt(i)) {
                    jump = true;
                }
            }
        }
        return !jump || longer.charAt(longer.length() - 1) == shorter.charAt(shorter.length() - 1);
    }
}