/**
 * @no 143
 * @name Reorder List
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode p = head;
        ListNode q = head;
        while (q.next != null) {
            q = q.next;
            if (q.next != null) {
                q = q.next;
            } else {
                break;
            }
            p = p.next;
        }
        ListNode backHead = p.next;
        p.next = null;

        Stack<ListNode> stack = new Stack<>();
        p = backHead;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }

        ListNode newList = new ListNode(0);
        p = head;
        while (!stack.empty()) {
            newList.next = p;
            p = p.next;
            newList = newList.next;
            newList.next = null;
            q = stack.pop();
            newList.next = q;
            newList = newList.next;
            newList.next = null;
        }
        if (p != null) {
            newList.next = p;
            newList = newList.next;
            newList.next = null;
        }
    }
}