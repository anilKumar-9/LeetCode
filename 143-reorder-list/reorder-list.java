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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
        {
            return ;
        }
        ListNode temp=head;
        ListNode mid=midNode(temp);
        ListNode next=mid.next;
        mid.next=null;
        mid=reverseLL(next);

        while(mid!=null)
        {   
            ListNode tempNext=temp.next;
            ListNode midNext=mid.next;

            temp.next=mid;
            mid.next=tempNext;
            temp=tempNext;
            mid=midNext;
        }
    }
    static ListNode midNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static ListNode reverseLL(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

}