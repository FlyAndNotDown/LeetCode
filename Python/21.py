"""
@no 21
@name Merge Two Sorted Lists
"""
class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        answer = ListNode(0)
        p = l1
        q = l2
        r = answer
        while p or q:
            if not p:
                temp = q.val
                q = q.next
            elif not q:
                temp = p.val
                p = p.next
            else:
                if p.val > q.val:
                    temp = q.val
                    q = q.next
                else:
                    temp = p.val
                    p = p.next
            r.next = ListNode(temp)
            r = r.next
        return answer.next
