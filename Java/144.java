/**
 * @no 144
 * @name Binary Tree Preorder Traversal
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalInternal(root, result);
        return result;
    }

    private void preorderTraversalInternal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderTraversalInternal(root.left, result);
        preorderTraversalInternal(root.right, result);
    }
}