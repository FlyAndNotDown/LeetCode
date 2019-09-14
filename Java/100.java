/**
 * @no 100
 * @name Same Tree
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || p != null && q != null && p.val == q.val &&
                ((p.left == null && q.left == null || p.left != null && q.left != null && isSameTree(p.left, q.left)) &&
                (p.right == null && q.right == null || p.right != null && q.right != null && isSameTree(p.right, q.right)));
    }
}
