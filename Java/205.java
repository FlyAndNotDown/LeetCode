/**
 * @no 205
 * @name Isomorphic Strings
 */
class Solution {
    public static boolean isIsomorphic(String s, String t) {
        return Solution.toIsomorphicString(s).equals(Solution.toIsomorphicString(t));
    }

    private static String toIsomorphicString(String s) {
        Map<Character, Character> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        char now = 'a';

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stringBuilder.append(map.get(c));
            } else {
                map.put(c, now++);
                stringBuilder.append(map.get(c));
            }
        }
        return stringBuilder.toString();
    }
}