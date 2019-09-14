"""
@no 102
@name Binary Tree Level Order Traversal
"""
class Solution:
    def __appendTreeNodeToListByOrder(self, node, l, order):
        order += 1
        l[order].append(node.val)
        if node.left:
            self.__appendTreeNodeToListByOrder(node.left, l, order)
        if node.right:
            self.__appendTreeNodeToListByOrder(node.right, l, order)

    def __getTreeDepth(self, node):
        if node:
            return max(self.__getTreeDepth(node.left), self.__getTreeDepth(node.right)) + 1
        else:
            return 0

    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root:
            l = [[] for _ in range(self.__getTreeDepth(root))]
            self.__appendTreeNodeToListByOrder(root, l, -1)
            return l
        else:
            return []
