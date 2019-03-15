/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if (!head) return head;

    let p = head, q = head.next;
    while (q) {
        if (p.val === q.val) {
            p.next = q.next;
            q = q.next;
        } else {
            p = p.next;
            q = q.next;
        }
    }

    return head;
};