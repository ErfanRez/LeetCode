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
    public ListNode reverseList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = head;
        ListNode current = dummyHead;
        Stack<Integer> stack = new Stack<>();

        while( p != null ){
            stack.push(p.val);
            p = p.next;
        }

        while(!stack.isEmpty()){
            current.next = new ListNode(stack.pop());
            current = current.next;
        }

        return dummyHead.next;
        
    }
}