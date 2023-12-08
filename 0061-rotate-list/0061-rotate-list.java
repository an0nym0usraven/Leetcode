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
    public ListNode findLastNode(ListNode curr, int n)
    {
        int count = 1;
        while(curr != null)
        {
            if(count == n)
            {
                return curr;
            }
            count++;
            curr = curr.next;
        }
        return curr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
        {
            return head;
        }
        
        int len = 1;
        ListNode curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
            len++;
        }
        
        if(k % len == 0)
        {
            return head;
        }
        
        k = k%len;
        
        curr.next = head;
        
        ListNode newLast = findLastNode(head, len-k);
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}