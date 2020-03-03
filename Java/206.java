/**
 * @no 206
 * @name Reverse Linked List
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode t = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return t;
    }
}