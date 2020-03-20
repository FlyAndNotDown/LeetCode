/**
 * @no 438
 * @name Find All Anagrams in a String
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] mapP = new int[26];
        for (char c : p.toCharArray()) {
            mapP[c - 'a']++;
        }

        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] mapS = new int[26];
        for (int i = 0; i < p.length(); i++) {
            mapS[s.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = p.length() - 1;
        mapS[s.charAt(right) - 'a']--;
        while (right < s.length()) {
            mapS[s.charAt(right) - 'a']++;
            if (checkOk(mapS, mapP)) {
                result.add(left);
            }
            mapS[s.charAt(left) - 'a']--;
            left++;
            right++;
        }
        return result;
    }

    private boolean checkOk(int[] mapS, int[] mapP) {
        for (int i = 0; i < 26; i++) {
            if (mapS[i] != mapP[i]) {
                return false;
            }
        }
        return true;
    }
}