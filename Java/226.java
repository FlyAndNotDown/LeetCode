/**
 * @no 226
 * @name Invert Binary Tree
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null) {
            root.left = invertTree(root.left);
        }
        if (root.right != null) {
            root.right = invertTree(root.right);
        }
        return root;
    }
}