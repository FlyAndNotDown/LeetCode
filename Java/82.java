/**
 * @no 82
 * @name Remove Duplicates from Sorted List II
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> repeat = new HashSet<>();
        ListNode p = head;
        while (p != null) {
            if (set.contains(p.val)) {
                repeat.add(p.val);
            } else {
                set.add(p.val);
            }
            p = p.next;
        }
        ListNode tHead = new ListNode(0);
        tHead.next = head;
        p = tHead;
        while (p.next != null) {
            if (repeat.contains(p.next.val)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return tHead.next;
    }
}