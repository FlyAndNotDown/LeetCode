/**
 * @no 349
 * @name Intersection of Two Arrays
 */
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int value : nums1) {
            set.add(value);
        }
        for (int value : nums2) {
            if (set.contains(value)) {
                temp.add(value);
            }
        }
        List<Integer> tempArray = new ArrayList<>(temp);
        int[] result = new int[temp.size()];
        for (int i = 0; i < tempArray.size(); i++) {
            result[i] = tempArray.get(i);
        }
        return result;
    }
}