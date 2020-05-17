/**
 * @no 187
 * @name Repeated DNA Sequences
 */
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 10) {
            return result;
        }
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            count.put(str, count.getOrDefault(str, 0) + 1);
        }
        for (String key : count.keySet()) {
            if (count.get(key) > 1) {
                result.add(key);
            }
        }
        return result;
    }
}