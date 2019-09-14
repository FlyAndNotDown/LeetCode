/**
 * @no 2
 * @name Add Two Numbers
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0), p = ans;

        int carry = 0;
        int num1, num2, temp;

        while (l1 != null || l2 != null) {
            num1 = l1 == null ? 0 : l1.val;
            num2 = l2 == null ? 0 : l2.val;
            temp = num1 + num2 + carry;
            carry = temp > 9 ? 1 : 0;
            temp = temp > 9 ? temp - 10 : temp;
            p.next = new ListNode(temp);
            p = p.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry == 1) {
            p.next = new ListNode(1);
        }

        return ans.next;
    }
}
