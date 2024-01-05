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
   public ListNode mergeKLists(ListNode[] lists) {
        ListNode avg=null;
        if(lists.length>0)
        avg=lists[0];
        else
        return null;
        for(int i=1;i<lists.length;i++){
         avg= mergeTwoLists(avg,lists[i]);
        }
        return avg;
    }
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp;ListNode head;
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        if(list1.val<=list2.val)
        {
            head=list1;
            temp=head;
            list1=list1.next;
        }
        else
        {
            head=list2;
            temp=head;
            list2=list2.next;
        }
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
         
        if(list1!=null)
        temp.next=list1;
        
        if(list2!=null)
        temp.next=list2;


        return head;
    }
}