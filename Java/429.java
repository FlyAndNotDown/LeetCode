/**
 * @no 429
 * @name N-ary Tree Level Order Traversal
 */
class Solution {
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderInternal(root, result, 0);
        return result;
    }

    private static void levelOrderInternal(Node root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        for (Node child : root.children) {
            levelOrderInternal(child, result, level + 1);
        }
    }
}