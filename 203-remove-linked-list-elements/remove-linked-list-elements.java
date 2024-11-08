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
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node to handle cases where the head itself needs to be removed
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;

        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next; // Remove the node by skipping it
            } else {
                temp = temp.next; // Only move to the next node if no removal
            }
        }

        return dummy.next; // Return the updated list starting from the original head
    }
}
