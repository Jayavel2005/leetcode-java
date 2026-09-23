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

    public ListNode removeNodes(ListNode head) {

        
        head = reverse(head);

        int max = head.val;

        ListNode tail = head;
        ListNode curr = head.next;

        while (curr != null) {

            if (curr.val < max) {
               
                tail.next = curr.next;
            } 
            else {
                
                tail = curr;
                max = curr.val;
            }

            curr = curr.next;
        }

        
        return reverse(head);
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}