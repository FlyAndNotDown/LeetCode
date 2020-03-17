/**
 * @no 1122
 * @name Relative Sort Array
 */
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int indexOfA = map.getOrDefault(a, Integer.MAX_VALUE);
                int indexOfB = map.getOrDefault(b, Integer.MAX_VALUE);
                if (indexOfA == indexOfB) {
                    return a - b;
                } else {
                    return indexOfA - indexOfB;
                }
            }
        });
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}