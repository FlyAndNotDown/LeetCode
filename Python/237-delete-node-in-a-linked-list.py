class Solution:
    def deleteNode(self, node):
        p = node
        while p.next.next:
            p.val = p.next.val
            p = p.next
        p.val = p.next.val
        p.next = None
