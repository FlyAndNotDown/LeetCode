public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    p.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    p.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            p = p.next;
        }
        return ans.next;
    }
}
