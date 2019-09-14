/**
 * @no 142
 * @name Linker List Cycle II
 */
var detectCycle = function(head) {
    if (!head) return null;
    let set = new Set();
    let p = head;
    while (p) {
        if (set.has(p)) return p;
        set.add(p);
        p = p.next;
    }
    return null;
};
