/**
 * @no 30
 * @name Substring with Concatenation of All Words
 */
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return result;
        }
        int perLength = words[0].length();

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int windowSize = perLength * words.length;
        NEXT:
        for (int i = 0; i < s.length() - windowSize + 1; i++) {
            Map<String, Integer> tempMap = new HashMap<>(map);
            for (int j = 0; j < words.length; j++) {
                String current = s.substring(i + j * perLength, i + (j + 1) * perLength);
                if (tempMap.containsKey(current) && tempMap.get(current) > 0) {
                    tempMap.replace(current, tempMap.get(current) - 1);
                } else {
                    continue NEXT;
                }
            }
            result.add(i);
        }
        return result;
    }
}