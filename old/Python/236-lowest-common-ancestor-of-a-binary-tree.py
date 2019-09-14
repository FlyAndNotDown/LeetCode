# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if not root: return None
        left_result = self.lowestCommonAncestor(root.left, p, q)
        right_result = self.lowestCommonAncestor(root.right, p, q)
        if not left_result and not right_result:
            if root == p: return p
            if root == q: return q
            return None
        if left_result and right_result:
            return root
        if left_result:
            if root == p: return p
            if root == q: return q
            return left_result
        if right_result:
            if root == p: return p
            if root == q: return q
            return right_result
