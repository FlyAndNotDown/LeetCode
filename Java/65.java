/**
 * @no 65
 * @name Valid Number
 */
class Solution {
    public boolean isNumber(String s) {
        if (s.indexOf('f') > -1 || s.indexOf('D') != -1) {
            return false;
        }
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}