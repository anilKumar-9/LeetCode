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
    static ListNode reverse(ListNode head)
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

    static ListNode kthNode(ListNode head,int k)
    {
        k--;
        ListNode temp=head;
        while(temp!=null&&k-->0)
        {
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null)
        {
            ListNode kthNode=kthNode(temp,k);
            if(kthNode==null)
            {
                
                    prev.next=temp;
           
                break;
            }

            ListNode nextNode=kthNode.next;
            kthNode.next=null;

            reverse(temp);
            if(head==temp)
            {
                head=kthNode;
            }
            else 
            {
                prev.next=kthNode;
            }
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
}