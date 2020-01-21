/**
 * @no 590
 * @name N-ary Tree Postorder Traversal
 */
class Solution {
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private static void postorder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        for (Node child : root.children) {
            postorder(child, result);
        }
        result.add(root.val);
    }
}