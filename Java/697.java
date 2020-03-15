/**
 * @no 697
 * @name Degree of an Array
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer[] arrays = map.get(nums[i]);
                arrays[0]++;
                arrays[2] = i;
            } else {
                map.put(nums[i], new Integer[] { 1, i, i });
            }
        }
        List<Integer[]> result = new ArrayList<>(map.values());
        result.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                if (a[0] < b[0]) {
                    return 1;
                } else if (a[0].equals(b[0])) {
                    return ((a[2] - a[1])) - (b[2] - b[1]);
                } else {
                    return -1;
                }
            }
        });
        Integer[] array = result.get(0);
        return array[2] - array[1] + 1;
    }
}