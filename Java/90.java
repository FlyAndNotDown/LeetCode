/**
 * @no 90
 * @name Subsets II
 */
class Solution {
    private List<Integer> current = new ArrayList<>();
    private Set<List<Integer>> set = new HashSet<>();
    private int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        backtrack(0);
        return new ArrayList<>(set);
    }

    private void backtrack(int i) {
        if (i >= nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        backtrack(i + 1);
        current.remove(current.size() - 1);
        backtrack(i + 1);
    }
}