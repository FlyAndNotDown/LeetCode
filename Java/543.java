/**
 * @no 543
 * @name Diameter of Binary Tree
 */
class Solution {
    private int answer = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return answer - 1;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        answer = Math.max(answer, left + right + 1);
        return Math.max(left, right) + 1;
    }
}