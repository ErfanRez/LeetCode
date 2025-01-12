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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;

        Map<Integer, Integer> map = new HashMap<>();

        while(p != null){
            map.put(p.val, map.getOrDefault(p.val, 0) + 1);
            p = p.next;
        }

        p = new ListNode(0, head);
        ListNode g = p;

        while(p.next != null){
            if(map.get(p.next.val) > 1){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }

        return g.next;
    }
}