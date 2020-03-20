/**
 * @no 1290
 * @name Convert Binary Number in a Linked List to Integer
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int result = head.val;
        ListNode p = head.next;
        while (p != null) {
            result = (result << 1) + p.val;
            p = p.next;
        }
        return result;
    }
}