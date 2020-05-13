/**
 * @no 116
 * @name Populating Next Right Pointers in Each Node
 */
class Solution {
    public Node connect(Node root) {
        connectInternal(root, null);
        return root;
    }

    private void connectInternal(Node root, Node next) {
        if (root == null) {
            return;
        }
        root.next = next;
        if (root.next == null) {
            connectInternal(root.left, root.right);
            connectInternal(root.right, null);
        } else {
            connectInternal(root.left, root.right);
            connectInternal(root.right, root.next.left);
        }
    }
}