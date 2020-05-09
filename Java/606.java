/**
 * @no 606
 * @name Construct String from Binary Tree
 */
class Solution {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t.val);
        if (t.left != null && t.right != null) {
            stringBuilder.append('(').append(tree2str(t.left)).append(')');
            stringBuilder.append('(').append(tree2str(t.right)).append(')');
        } else if (!(t.left == null && t.right == null)) {
            stringBuilder.append('(').append(tree2str(t.left)).append(')');
            if (t.right != null) {
                stringBuilder.append('(').append(tree2str(t.right)).append(')');
            }
        }
        return stringBuilder.toString();
    }
}