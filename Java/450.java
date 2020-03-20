/**
 * @no 450
 * @name Delete Node in a BST
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode min = root.right;
                while (min.left != null) {
                    min = min.left;
                }
                int t = root.val;
                root.val = min.val;
                min.val = t;
                root.right = deleteNode(root.right, key);
            }
        }
        return root;
    }
}