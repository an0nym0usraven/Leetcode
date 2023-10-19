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
        if(head == null || head.next == null)
        {
            return head;
        }
        
        ListNode curr = head;
        ListNode p = curr;
        
        while(curr!= null && curr.next != null)
        {
            int currVal =curr.val;
            
            while(p.next != null && p.next.val == currVal)
            {
                p = p.next;
            }
            
            curr.next = p.next;
            curr = curr.next;
            p = curr;
        }
        
        return head;
    }
}