/**
 * @no 83
 * @name Remove Duplicates from Sorted List
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