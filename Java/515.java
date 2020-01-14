/**
 * @no 515
 * @name Find Largest Value in Each Tree Row
 */
class Solution {
    public static List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> levelOrderTraversalResult = new ArrayList<>();
        traversalByLevelOrder(root, levelOrderTraversalResult, 0);
        List<Integer> result = new ArrayList<>();
        for (List<Integer> level : levelOrderTraversalResult) {
            int max = level.get(0);
            for (int value : level) {
                if (value > max) {
                    max = value;
                }
            }
            result.add(max);
        }
        return result;
    }

    private static void traversalByLevelOrder(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        traversalByLevelOrder(root.left, result, level + 1);
        traversalByLevelOrder(root.right, result, level + 1);
    }
}