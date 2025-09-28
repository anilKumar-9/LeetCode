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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode tempHead=new ListNode(Integer.MIN_VALUE);
        ListNode prev=tempHead;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;
            while(prev.next!=null&&prev.next.val<curr.val)
            {
                prev=prev.next;
            }
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
            prev=tempHead;
        }
        return tempHead.next;
    }
}