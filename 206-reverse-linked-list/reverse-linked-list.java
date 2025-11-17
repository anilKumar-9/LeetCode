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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head.next;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null)
        {
            head.next=null;
            st.push(head);
            head=temp;
            temp=temp.next;
        }
        st.push(head);
        
        head=st.pop();
        temp=head;

        while(!st.isEmpty())
        {
            temp.next=st.pop();
            temp=temp.next;
        }
        
        return head;
    }
}