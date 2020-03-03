/**
 * @no 1.1
 * @name Is Unique LCCI
 */
class Solution {
    public boolean isUnique(String string) {
        long flags = 0;
        for (int i = 0; i < string.length(); i++) {
            long t = 1 << (string.charAt(i) - 'a');
            if ((flags & t) == t) {
                return false;
            }
            flags |= t;
        }
        return true;
    }
}