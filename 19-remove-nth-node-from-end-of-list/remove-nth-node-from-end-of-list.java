/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;        
    }
}


//My solution (Space more optimized):

// class Solution {
//     public ListNode removeLast(ListNode head){
//         ListNode p = head;

//         while(p.next.next != null){
//             p = p.next;
//         }

//         p.next = null;

//         return head;
//     }

//     public ListNode removeFirst(ListNode head){
//         return head = head.next;
//     }

//     public int size(ListNode head){
//         int size = 0;
//         ListNode p = head;

//         while(p != null){
//             p = p.next;
//             size++;
//         }

//         return size;
//     }

//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int size = size(head);

//         if(size == 1) return null;
//         if(n == 1) return removeLast(head);

//         if(n == size) return removeFirst(head);

//         ListNode p = head;
//         for(int i = 1; i < size - n; i++){
//             p = p.next;
//         }

//         p.next = p.next.next;

//         return head;

//     }
// }