/**
 * @no 22
 * @name Generate Parentheses
 */
class Solution {
    private List<String> result = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        backtrack(0, 0, new StringBuilder());
        return result;
    }

    private void backtrack(int left, int right, StringBuilder current) {
        if (left == n && right == n && left == right) {
            result.add(current.toString());
            return;
        }
        if (left > n || right > n || right > left) {
            return;
        }
        StringBuilder t1 = new StringBuilder(current);
        t1.append('(');
        backtrack(left + 1, right, t1);
        StringBuilder t2 = new StringBuilder(current);
        t2.append(')');
        backtrack(left, right + 1, t2);
    }
}