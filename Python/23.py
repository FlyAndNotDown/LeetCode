"""
@no 23
@name Merge K Sorted Lists
"""
class Solution:
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        l = []
        for list in lists:
            p = list
            while p:
                l.append(p.val)
                p = p.next
        l.sort()
        answer = ListNode(0)
        p = answer
        for num in l:
            p.next = ListNode(num)
            p = p.next
        return answer.next
