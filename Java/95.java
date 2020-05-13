/**
 * @no 95
 * @name Unique Binary Search Trees II
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        return generateTreesInternal(1, n);
    }

    private List<TreeNode> generateTreesInternal(int start, int end) {
        if (start > end) {
            return new ArrayList<TreeNode>() {{
                add(null);
            }};
        }
        List<TreeNode> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftOptions = generateTreesInternal(start, i - 1);
            List<TreeNode> rightOptions = generateTreesInternal(i + 1, end);
            for (TreeNode left : leftOptions) {
                for (TreeNode right : rightOptions) {
                    TreeNode tmp = new TreeNode(i);
                    tmp.left = left;
                    tmp.right = right;
                    result.add(tmp);
                }
            }
        }
        return result;
    }
}