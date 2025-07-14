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
    public int getDecimalValue(ListNode head) {
        String ans="";
        while(head!=null)
        {
            ans+=head.val;
            head=head.next;
        }
        int product=1,res=0;
        for(int i=ans.length()-1;i>=0;i--)
        {
            if(ans.charAt(i)=='1')
            {
                res+=product;
            }
            product*=2;
        }
        return res;
    }
}