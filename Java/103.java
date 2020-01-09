/**
 * @no 103
 * @name Binary Tree Zigzag Level Order Traversal
 */
class Solution {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigzagLevelOderInternal(root, result, 0);
        for (int i = 0; i < result.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(result.get(i));
            }
        }
        return result;
    }

    private static void zigzagLevelOderInternal(TreeNode root, List<List<Integer>> result, int currentIndex) {
        if (root == null) {
            return;
        }
        if (currentIndex == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(currentIndex).add(root.val);
        zigzagLevelOderInternal(root.left, result, currentIndex + 1);
        zigzagLevelOderInternal(root.right, result, currentIndex + 1);
    }
}