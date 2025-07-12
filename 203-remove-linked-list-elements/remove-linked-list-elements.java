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
    public ListNode removeElements(ListNode head, int val) {
       if(head==null)
       {
        return null;
       }
    ListNode root=head;
       while(root!=null&&root.val==val)
       {
        if(root!=null)
        root=root.next;
       }
       if(root==null)
       {
        return null;
       }
       head=root;

       while(root!=null&&root.next!=null)
       {
        if(root.next.val==val)
        root.next=root.next.next;
        else
        root=root.next;
       }

     return head;
    }
}