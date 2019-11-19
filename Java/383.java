/**
 * @no 383
 * @name Ransom Note
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (count.containsKey(c)) {
                count.replace(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (count.containsKey(c)) {
                if (count.get(c) <= 0) {
                    return false;
                }
                count.replace(c, count.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}