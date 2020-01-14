/**
 * @no 551
 * @name Student Attendance Record I
 */
class Solution {
    public boolean checkRecord(String s) {
        char lastChar = 'N';
        char lastTwoChar = 'N';
        int aCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A' && ++aCount > 1) {
                return false;
            }
            if (c == 'L' && lastChar == 'L' && lastTwoChar == 'L') {
                return false;
            }
            lastTwoChar = lastChar;
            lastChar = c;
        }
        return true;
    }
}