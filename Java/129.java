/**
 * @no 129
 * @name Sum Root to Leaf Numbers
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersInternal(root, 0);
    }

    private int sumNumbersInternal(TreeNode root, int current) {
        if (root == null) {
            return 0;
        }
        int next = current * 10 + root.val;
        if (root.left == null && root.right == null) {
            return next;
        }
        return sumNumbersInternal(root.left, next) + sumNumbersInternal(root.right, next);
    }
}