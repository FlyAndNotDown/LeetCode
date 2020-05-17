/**
 * @no 138
 * @name Copy List with Random Pointer
 */
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head, newHead);
        Node p = head;
        Node q = newHead;
        while (p.next != null) {
            q.next = new Node(p.next.val);
            map.put(p.next, q.next);
            p = p.next;
            q = q.next;
        }
        p = head;
        q = newHead;
        while (p != null) {
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return newHead;
    }
}