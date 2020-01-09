/**
 * @no 106
 * @name Construct Binary Tree from Inorder and Postorder Traversal
 */
class Solution {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int index = findElementInArray(postorder[postorder.length - 1], inorder);
        int rightTreeLength = postorder.length - index - 1;
        root.left = buildTree(
            Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
        root.right = buildTree(
            Arrays.copyOfRange(inorder, index + 1, index + rightTreeLength + 1), Arrays.copyOfRange(postorder, index, index + rightTreeLength));
        return root;
    }

    public static int findElementInArray(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}