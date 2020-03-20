/**
 * @no 4.3
 * @name List of Depth LCCI
 */
class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> heads = new ArrayList<>();
        List<ListNode> lasts = new ArrayList<>();
        listOfDepthInternal(tree, 1, heads, lasts);
        return heads.toArray(new ListNode[0]);
    }

    private void listOfDepthInternal(TreeNode treeNode, int depth, List<ListNode> heads, List<ListNode> lasts) {
        if (treeNode == null) {
            return;
        }
        if (depth > lasts.size()) {
            ListNode head = new ListNode(treeNode.val);
            heads.add(head);
            lasts.add(head);
        } else {
            lasts.get(depth - 1).next = new ListNode(treeNode.val);
            lasts.set(depth - 1, lasts.get(depth - 1).next);
        }
        listOfDepthInternal(treeNode.left, depth + 1, heads, lasts);
        listOfDepthInternal(treeNode.right, depth + 1, heads, lasts);
    }
}