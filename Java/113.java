/**
 * @no 113
 * @name Path Sum II
 */
class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }
        pathSumInternal(root, sum, new ArrayList<Integer>() {{
            add(root.val);
        }});
        return result;
    }

    private void pathSumInternal(TreeNode root, int sum, List<Integer> path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            int t = getSum(path);
            if (sum == t) {
                result.add(path);
            }
        }
        if (root.left != null) {
            List<Integer> leftPath = new ArrayList<>(path);
            leftPath.add(root.left.val);
            pathSumInternal(root.left, sum, leftPath);
        }
        if (root.right != null) {
            List<Integer> rightPath = new ArrayList<>(path);
            rightPath.add(root.right.val);
            pathSumInternal(root.right, sum, rightPath);
        }
    }

    private int getSum(List<Integer> path) {
        int sum = 0;
        for (int number : path) {
            sum += number;
        }
        return sum;
    }
}