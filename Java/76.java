/**
 * @no 76
 * @name Minimum Window Substring
 */
class Solution {
    public String minWindow(String s, String t) {
        int[] mapT = new int[58];
        for (int i = 0; i < t.length(); i++) {
            mapT[t.charAt(i) - 'A']++;
        }

        String result = s + s;
        int[] mapS = new int[58];
        int left = 0, right = 0;
        while (right < s.length()) {
            mapS[s.charAt(right) - 'A']++;
            right++;
            while (checkOk(mapS, mapT)) {
                String current = s.substring(left, right);
                result = current.length() < result.length() ? current : result;
                mapS[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return result.equals(s + s) ? "" : result;
    }

    private boolean checkOk(int[] mapS, int[] mapT) {
        for (int i = 0; i < 58; i++) {
            if (mapT[i] > 0 && mapS[i] < mapT[i]) {
                return false;
            }
        }
        return true;
    }
}