/**
 * @no 145
 * @name Binary Tree Postorder Traversal
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversalInternal(root, result);
        return result;
    }

    private void postorderTraversalInternal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorderTraversalInternal(root.left, result);
        postorderTraversalInternal(root.right, result);
        result.add(root.val);
    }
}