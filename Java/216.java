/**
 * @no 216
 * @name Combination Sum III
 */
class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int k;
    private int n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        backtrack(new ArrayList<>(), 1);
        return result;
    }

    private void backtrack(List<Integer> log, int i) {
        if (log.size() == k) {
            int sum = 0;
            for (int number : log) {
                sum += number;
            }
            if (sum == n) {
                result.add(log);
            }
            return;
        }
        if (i > 9) {
            return;
        }
        backtrack(new ArrayList<Integer>(log) {{ add(i); }}, i + 1);
        backtrack(new ArrayList<>(log), i + 1);
    }
}