/**
 * @no 3
 * @name Longest Substring without Repeating Characters
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0, p = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int q = 0; q < s.length(); q++) {
            p = Math.max(p, map.keySet().contains(s.charAt(q)) ? (int) map.get(s.charAt(q)) + 1: 0);
            ans = Math.max(ans, q - p + 1);
            map.put(s.charAt(q), q);
        }

        return ans;
    }
}
