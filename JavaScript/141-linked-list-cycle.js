/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let set = new Set();
    let p = head;
    while (p) {
        if (set.has(p)) return true;
        set.add(p);
        p = p.next;
    }
    return false;
};
