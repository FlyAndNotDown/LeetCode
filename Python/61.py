"""
@no 61
@name Rotate List
"""
class Solution:
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if not head: return None
        elif not head.next: return head

        length = 1
        p = head
        while p.next:
            length += 1
            p = p.next
        p.next = head

        k = k % length
        for _ in range(length - k):
            head = head.next
            p = p.next
        p.next = None
        return head
