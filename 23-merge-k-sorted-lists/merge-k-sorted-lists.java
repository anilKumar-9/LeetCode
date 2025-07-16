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
        if(lists.length==0)
        {
            return null;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode curr=lists[i];
            while(curr!=null)
            {
            pq.offer(curr.val);
            curr=curr.next;
            }
        }
        ListNode head=new ListNode(-1);
        ListNode root=head;
        while(!pq.isEmpty())
        {
            ListNode newNode=new ListNode(pq.poll());
            root.next=newNode;
            root=newNode;
        }
        return head.next;
    }
}