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
    private int getSize(ListNode head){
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        return size;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int middle = getSize(head) / 2;

        for(int i = 0; i < middle; i++){
            temp = temp.next;
        }

        return temp;


    }
}