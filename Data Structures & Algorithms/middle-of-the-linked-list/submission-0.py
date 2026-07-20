# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res=[]
        n=0
        if not head.next:
            return head
        while(head):
            n+=1
            res.append(head)
            head=head.next
        return res[int(n/2)]