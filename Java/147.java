/**
 * @no 147
 * @name Insertion Sort List
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head.next;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head.next = null;
        ListNode q;
        while (p != null) {
            q = newHead;
            while (q.next != null && p.val > q.next.val) {
                q = q.next;
            }
            if (q.next == null) {
                q.next = p;
                p = p.next;
                q.next.next = null;
            } else {
                ListNode t = q.next;
                q.next = p;
                p = p.next;
                q.next.next = t;
            }
        }
        return newHead.next;
    }
}