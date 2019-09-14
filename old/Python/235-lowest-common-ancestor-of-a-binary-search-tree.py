# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        smaller = p if p.val < q.val else q
        bigger = q if p.val < q.val else p
        if smaller == root and bigger.val >= root.val: return smaller
        if bigger == root and smaller.val <= root.val: return bigger
        if smaller.val < root.val and bigger.val > root.val: return root
        if bigger.val < root.val: return self.lowestCommonAncestor(root.left, p, q)
        if smaller.val > root.val: return self.lowestCommonAncestor(root.right, p, q)
