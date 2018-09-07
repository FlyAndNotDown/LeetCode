# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def count(self, root):
        if not root: return 0
        return self.count(root.left) + self.count(root.right) + 1

    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        count_left = self.count(root.left)
        if count_left + 1 == k: return root.val
        elif count_left + 1 > k: return self.kthSmallest(root.left, k)
        else: return self.kthSmallest(root.right, k - count_left - 1)
        
