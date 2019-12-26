/**
 * @no 24
 * @name Swap Nodes in Pairs
 */
class Solution {
    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode next = head.next;
        if (next == null) {
            return head;
        }

        ListNode temp = swapPairs(next.next);
        next.next = head;
        head.next = temp;
        return next;
    }
}