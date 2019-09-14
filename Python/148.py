"""
@no 148
@name Sort List
"""
class Solution:
    def getMid(self, head):
        p = head
        q = head
        while q:
            q = q.next
            if not q: break
            q = q.next
            if not q: break
            p = p.next
        t = p.next
        p.next = None
        return t

    def merge(self, head1, head2):
        head = ListNode(0)
        p = head1
        q = head2
        r = head
        while p or q:
            if not p:
                r.next = q
                q = q.next
                r = r.next
            elif not q:
                r.next = p
                p = p.next
                r = r.next
            else:
                if p.val < q.val:
                    r.next = p
                    p = p.next
                    r = r.next
                else:
                    r.next = q
                    q = q.next
                    r = r.next
        r.next = None
        return head.next


    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next: return head
        mid = self.getMid(head)
        return self.merge(self.sortList(head), self.sortList(mid))
