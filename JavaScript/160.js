/**
 * @no 160
 * @name Intersection of Two Linker Lists
 */
var getIntersectionNode = function(headA, headB) {
    let set = new Set();
    let p = headA;
    while (p) {
        set.add(p.val);
        p = p.next;
    }
    p = headB;
    while (p) {
        if (set.has(p.val)) return p;
        p = p.next;
    }
    return null;
};
