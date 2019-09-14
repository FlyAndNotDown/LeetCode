/**
 * @no 141
 * @name Linked List Cycle
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
