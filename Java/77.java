/**
 * @no 77
 * @name Combinations
 */
class Solution {
    private List<List<Integer>> result;
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.result = new ArrayList<>();
        this.n = n;
        this.k = k;
        backtrack(1, new ArrayList<>());
        return result;
    }

    private void backtrack(int i, List<Integer> current) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int t = i; t <= n; t++) {
            current.add(t);
            backtrack(t + 1, current);
            current.remove(current.size() - 1);
        }
    }
}