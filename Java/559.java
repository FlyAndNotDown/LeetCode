/**
 * @no 559
 * @name Maximum Depth of N-ary Tree
 */
class Solution {
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            int childDepth = maxDepth(child);
            if (childDepth > max) {
                max = childDepth;
            }
        }
        return max + 1;
    }
}