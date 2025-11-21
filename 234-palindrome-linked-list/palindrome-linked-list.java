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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null||head.next==null)
        {
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next; 
        }
        ListNode first=reverseLL(slow);
        ListNode second=head;

        while(first!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }
        
        return true;
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