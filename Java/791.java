/**
 * @no 791
 * @name Custom Sort String
 */
class Solution {
    public String customSortString(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        char[] charArray = t.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            charList.add(charArray[i]);
        }
        charList.sort(new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int indexOfA = map.getOrDefault(a, -1);
                int indexOfB = map.getOrDefault(b, -1);
                if (indexOfA == indexOfB) {
                    return a - b;
                }
                return indexOfA - indexOfB;
            }
        });
        for (int i = 0; i < charList.size(); i++) {
            charArray[i] = charList.get(i);
        }
        return new String(charArray);
    }
}