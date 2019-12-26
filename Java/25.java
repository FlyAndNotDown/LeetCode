/**
 * @no 25
 * @name Reverse Nodes in k-Group
 */
class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int count = 1;
        ListNode p = head;
        ListNode[] listNodes = new ListNode[k];
        while (count <= k && p != null) {
            listNodes[(count++) - 1] = p;
            p = p.next;
        }
        if (count <= k) {
            return head;
        }

        ListNode temp = reverseKGroup(listNodes[k - 1].next, k);
        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i + 1].next = listNodes[i];
        }
        listNodes[0].next = temp;
        return listNodes[k - 1];
    }
}