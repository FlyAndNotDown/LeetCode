class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def getDepthOfTree(self, node):
        if node:
            return max(self.getDepthOfTree(node.left), self.getDepthOfTree(node.right)) + 1
        else:
            return 0

    def append(self, l, node, location):
        if node:
            l[location].append(node.val)
            self.append(l, node.left, location + 1)
            self.append(l, node.right, location + 1)

    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        l = []
        depth = self.getDepthOfTree(root)
        for i in range(0, depth):
            l.append([])

        location = 0
        self.append(l, root, location)
        return l[::-1]
