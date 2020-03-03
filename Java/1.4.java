/**
 * @no 1.4
 * @name Palindrome Permutation LCCI
 */
class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int sum = 0;
        for (int value : map.values()) {
            if (value % 2 == 1) {
                sum++;
            }
        }
        return sum < 2;
    }
}