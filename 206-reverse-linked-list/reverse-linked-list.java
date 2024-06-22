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

 // Iterative solution:
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while( current != null ){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}

//Recursive Solution:

// public ListNode reverseList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode newHead = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;        
//   }

/////////////////////////////////////////////////////////////////////

//My way (Less optimized):

// public ListNode reverseList(ListNode head) {
//         ListNode dummyHead = new ListNode(0);
//         ListNode p = head;
//         ListNode current = dummyHead;
//         Stack<Integer> stack = new Stack<>();

//         while( p != null ){
//             stack.push(p.val);
//             p = p.next;
//         }

//         while(!stack.isEmpty()){
//             current.next = new ListNode(stack.pop());
//             current = current.next;
//         }

//         return dummyHead.next;
        
//     }