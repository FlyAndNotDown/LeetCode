/**
 * @no 15
 * @name 3Sum
 */
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        return threeSumInternal(nums, 0);
    }

    private static List<List<Integer>> threeSumInternal(int[] nums, int target) {
        if (nums.length < 3) { return new ArrayList<>(); }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) { list.add(num); }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        int length = list.size();
        List<List<Integer>> result = new ArrayList<>();
        if (list.get(0) > target || list.get(length - 1) < target) {
            return result;
        }
        for (int i = 0; i < length - 2; i++) {
            if (i != 0 && list.get(i).equals(list.get(i - 1))) {
                continue;
            }

            if (list.get(i) > target) {
                return result;
            }
            int j = i + 1;
            int k = length - 1;
            while (j < k) {
                int sum = list.get(i) + list.get(j) + list.get(k);
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(list.get(i));
                    temp.add(list.get(j));
                    temp.add(list.get(k));
                    result.add(temp);
                    while (j < k && list.get(j).equals(list.get(++j)));
                    while (j < k && list.get(k).equals(list.get(--k)));
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}