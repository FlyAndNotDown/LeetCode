/**
 * @no 98
 * @name Validate Binary Search Tree
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBSTLeft(root.left, root.val) || !isValidBSTRight(root.right, root.val)) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }

    private boolean isValidBSTLeft(TreeNode root, int number) {
        if (root == null) {
            return true;
        }
        if (root.val >= number) {
            return false;
        }
        return isValidBSTLeft(root.left, number) &&
            isValidBSTLeft(root.right, number);
    }

    private boolean isValidBSTRight(TreeNode root, int number) {
        if (root == null) {
            return true;
        }
        if (root.val <= number) {
            return false;
        }
        return isValidBSTRight(root.left, number) &&
            isValidBSTRight(root.right, number);
    }
}