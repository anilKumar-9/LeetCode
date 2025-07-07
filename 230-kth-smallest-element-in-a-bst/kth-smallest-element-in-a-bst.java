/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int []counter={0};
        int []ksmall={0};
        inOrder(root,counter,k,ksmall);
        return ksmall[0];        
    }
    static void inOrder(TreeNode root,int []counter,int k,int []ksmall)
    {
        if(root==null||counter[0]>k)
        {
            return ;
        }
        inOrder(root.left,counter,k,ksmall);
        counter[0]++;
        if(counter[0]==k)
        {
            ksmall[0]=root.val;
            return ;
        }
        inOrder(root.right,counter,k,ksmall);
    }
}