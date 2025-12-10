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
    public boolean isBalanced(TreeNode root) {
        int res=heightCheck(root);
        return res==-1?false:true;
    }

    static int heightCheck(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=heightCheck(root.left);

        int  right=heightCheck(root.right);

        if(Math.abs(left-right)>1)
        {
            return -1;
        }

        if(left==-1||right==-1)
        {
            return -1;
        }

        return 1+Math.max(left,right);
    }
}