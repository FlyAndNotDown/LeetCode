/**
 * @no 199
 * @name Binary Tree Right Side View
 */
class Solution {
    public static List<Integer> rightSideView(TreeNode root) {
        List<List<TreeNode>> container = new ArrayList<>();
        if (root != null) {
            List<TreeNode> temp = new ArrayList<>();
            temp.add(root);
            container.add(temp);
        } else {
            return new ArrayList<>();
        }
        while (!container.get(container.size() - 1).isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode node : container.get(container.size() - 1)) {
                if (node.left != null) { temp.add(node.left); }
                if (node.right != null) { temp.add(node.right); }
            }
            container.add(temp);
        }
        List<Integer> result = new ArrayList<>();
        for (List<TreeNode> row : container) {
            if (!row.isEmpty()) {
                result.add(row.get(row.size() - 1).val);
            }
        }
        return result;
    }
}