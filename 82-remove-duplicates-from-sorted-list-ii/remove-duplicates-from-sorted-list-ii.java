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
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        while(temp!=null&&temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
               while(temp.next!=null&&temp.val==temp.next.val)
               {
                    temp=temp.next;
               }
               prev.next=temp.next;
            }
            else 
            {
                prev=prev.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}