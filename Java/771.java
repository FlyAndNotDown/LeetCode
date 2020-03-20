/**
 * @no 771
 * @name Jewels and Stones
 */
class Solution {
    public int numJewelsInStones(String j, String s) {
        boolean[] map = new boolean[58];
        for (char c : j.toCharArray()) {
            map[c - 'A'] = true;
        }
        int reuslt = 0;
        for (char c : s.toCharArray()) {
            if (map[c - 'A']) {
                reuslt++;
            }
        }
        return reuslt;
    }
}