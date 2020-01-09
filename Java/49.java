/**
 * @no 49
 * @name Group Anagrams
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> sorted = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            sorted.add(new String(temp));
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(sorted.get(i))) {
                map.put(sorted.get(i), new ArrayList<>());
            }
            map.get(sorted.get(i)).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}