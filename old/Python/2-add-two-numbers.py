class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        p = l1
        num = 0
        count = 0
        while p:
            num += (10**count) * p.val
            count += 1
            p = p.next

        p = l2
        count = 0
        while p:
            num += (10**count) * p.val
            count += 1
            p = p.next

        l = []
        if num == 0:
            l.append(0)
        else:
            while num > 0:
                l.append(num % 10)
                num = num // 10

        start = None
        count = 0
        for n in l:
            if count == 0:
                start = ListNode(n)
                p = start
                count += 1
            else:
                p.next = ListNode(n)
                p = p.next
                count += 1

        return start
