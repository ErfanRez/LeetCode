# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:

            arr = []

            curr = head

            dummy = ListNode(0)
            dum = dummy

            while curr:
                arr.append(curr.val)
                curr = curr.next
            
            ans = Counter(arr)

            for key,val in ans.items():

                if val == 1:

                    new = ListNode(key)

                    dum.next = new

                    dum = dum.next
            
            return dummy.next


            
        