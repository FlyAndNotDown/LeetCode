/**
 * @no 173
 * @name Binary Search Tree Iterator
 */
public class BSTIterator {
    private List<Integer> result;

    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
    }

    public BSTIterator(TreeNode root) {
        result = new ArrayList<>();
        inorderTraversal(root);
    }

    /** @return the next smallest number */
    public int next() {
        return result.remove(0);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return result.size() > 0;
    }
}
