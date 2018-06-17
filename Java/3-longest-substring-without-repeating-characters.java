public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 判断字符串是否为空
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0, p = 0;
        // 建立一个键值对容器
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        // 滑动窗口法
        for (int q = 0; q < s.length(); q++) {
            p = Math.max(p, map.keySet().contains(s.charAt(q)) ? (int) map.get(s.charAt(q)) + 1: 0);
            ans = Math.max(ans, q - p + 1);
            map.put(s.charAt(q), q);
        }

        // 返回结果
        return ans;
    }
}
