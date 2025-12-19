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
    public int sumNumbers(TreeNode root) {
        long []sum=new long[1];
        preOrder(root,sum,0);
        return (int)sum[0];
    }

    static void preOrder(TreeNode root,long []sum,long currentSum)
    {
        if(root==null)
        {
            return;
        }


        if(root.left==null&&root.right==null)
        {
            sum[0]+=currentSum*10+root.val;
            return;
        }
        
        
        currentSum=currentSum*10+root.val;
        preOrder(root.left,sum,currentSum);
        preOrder(root.right,sum,currentSum);

    }
}