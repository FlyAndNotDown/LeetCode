/**
 * @no 108
 * @name Convert Sorted Array to Binary Search Tree
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        int length = nums.length;
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, length / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, length / 2 + 1, length));
        return root;
    }
}