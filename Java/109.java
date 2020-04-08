/**
 * @no 109
 * @name Convert Sorted List to Binary Search Tree
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> array = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            array.add(p.val);
            p = p.next;
        }
        return sortedListToBSTInternal(array, 0, array.size() - 1);
    }

    private TreeNode sortedListToBSTInternal(List<Integer> array, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode treeNode = new TreeNode(array.get(mid));
        treeNode.left = sortedListToBSTInternal(array, left, mid - 1);
        treeNode.right = sortedListToBSTInternal(array, mid + 1, right);
        return treeNode;
    }
}