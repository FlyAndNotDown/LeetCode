"""
@no 124
@name Binary Tree Maximum Path Sum
"""
class Solution:
    def maxPathSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        ans = self.test(root)
        return max(ans[0], ans[1])

    def test(self, root):
        if not root: return [-10000000, -10000000]
        if root and not root.left and not root.right: return [root.val, root.val]
        left = self.test(root.left)
        right = self.test(root.right)
        return [
            max(max(left[0], right[0]) + root.val, root.val),
            max(max(max(left[1], right[1]), left[0] + right[0] + root.val), max(left[0], right[0]))
        ]
