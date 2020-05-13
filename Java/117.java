/**
 * @no 117
 * @name Populating Next Right Pointers in Each Node II
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
        if (root.right != null) {
            connectInternal(root.right, getNextChild(next));
        }
        if (root.left != null) {
            if (root.right != null) {
                connectInternal(root.left, root.right);
            } else {
                connectInternal(root.left, getNextChild(next));
            }
        }
    }

    private Node getNextChild(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            return root.left;
        } else if (root.right != null) {
            return root.right;
        } else {
            return getNextChild(root.next);
        }
    }
}