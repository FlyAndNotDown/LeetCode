/**
 * @no 92
 * @name Reverse Linked List II
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }
        if (nodes.isEmpty()) {
            return null;
        }
        int left = m - 1;
        for (int i = 0; i <= (n - m) / 2; i++) {
            ListNode t = nodes.get(left + i);
            nodes.set(left + i, nodes.get(left + n - m - i));
            nodes.set(left + n - m - i, t);
        }

        ListNode newHead = nodes.get(0);
        p = newHead;
        for (int i = 1; i < nodes.size(); i++) {
            p.next = nodes.get(i);
            p = p.next;
        }
        p.next = null;
        return newHead;
    }
}