/**
 * @no 114
 * @name Flatten Binary Tree to Linked List
 */
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode last = getLastNode(root.left);
        if (last == null) {
            return;
        }
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        last.right = right;
    }

    private TreeNode getLastNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        return p;
    }
}