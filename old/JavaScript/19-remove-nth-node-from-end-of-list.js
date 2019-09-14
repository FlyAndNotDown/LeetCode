/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
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
