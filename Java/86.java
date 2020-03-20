/**
 * @no 86
 * @name Partition List
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode p = head;
        ListNode p1 = left;
        ListNode p3 = right;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p = p.next;
                p1.next.next = null;
                p1 = p1.next;
            } else {
                p3.next = p;
                p = p.next;
                p3.next.next = null;
                p3 = p3.next;
            }
        }
        p1.next = right.next;
        return left.next;
    }
}