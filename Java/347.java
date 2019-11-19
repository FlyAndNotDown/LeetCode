/**
 * @no 347
 * @name Top K Frequent Elements
 */
class Solution {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.replace(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(count.keySet());
        List<Integer> values = new ArrayList<>(count.values());
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(keys.get(i));
            temp.add(values.get(i));
            list.add(temp);
        }
        list.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                return l2.get(1) - l1.get(1);
            }
        });
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).get(0));
        }
        return result;
    }
}