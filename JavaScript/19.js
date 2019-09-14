/**
 * @no 19
 * @name Remove Nth Node from End of List
 */
let removeNthFromEnd = function (head, n) {

    let node = [];
    let t = head;
    while (t) {
        node.push(t);
        t = t.next;
    }
    let removeIndex = node.length - n;
    if (removeIndex === 0) {
        head = head.next;
    } else {
        node[removeIndex] = null;
        node[removeIndex - 1].next = node[removeIndex + 1];
    }
    return head;

};
