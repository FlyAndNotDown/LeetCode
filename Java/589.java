/**
 * @no 589
 * @name N-ary Tree Preorder Traversal
 */
class Solution {
    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preorderInternal(root, result);
        return result;
    }

    private static void preorderInternal(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        for (Node child : root.children) {
            preorderInternal(child, result);
        }
    }
}