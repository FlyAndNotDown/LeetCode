/**
 * @no 124
 * @name Binary Tree Maximum Path Sum
 */
class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumInternal(root);
        return maxSum;
    }

    private int maxPathSumInternal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxPathSumInternal(root.left));
        int right = Math.max(0, maxPathSumInternal(root.right));
        maxSum = Math.max(maxSum, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}