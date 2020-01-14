/**
 * @no 513
 * @name Find Bottom Left Tree Value
 */
class Solution {
    public static int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> levelTraversalResult = new ArrayList<>();
        traversalByLevel(root, levelTraversalResult, 0);
        return levelTraversalResult.get(levelTraversalResult.size() - 1).get(0);
    }

    private static void traversalByLevel(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        traversalByLevel(root.left, result, level + 1);
        traversalByLevel(root.right, result, level + 1);
    }
}