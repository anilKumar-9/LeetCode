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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        // if(targetSum==0&&root.val!=0)
        // {
        //     return false;
        // }
        boolean []brr=new boolean[1];
        preOrder(root,targetSum,0,brr);

        return brr[0];
    }

    static void preOrder(TreeNode root,int targetSum,int currentSum,boolean [] brr)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            currentSum+=root.val;
            if(currentSum==targetSum)
            {
                brr[0]= true;
            }
            return ;
        }
        currentSum+=root.val;
        System.out.println(currentSum);
        preOrder(root.left,targetSum,currentSum,brr);
        preOrder(root.right,targetSum,currentSum,brr);
    }
}