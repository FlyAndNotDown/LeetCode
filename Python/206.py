"""
@no 206
@name Reverse Linked List
"""
class Solution:
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head: return None
        elif not head.next: return head
        else:
            p = head
            q = head.next
            while q.next:
                t = q.next
                q.next = p
                p = q
                q = t
            q.next = p
            head.next = None
            return q
