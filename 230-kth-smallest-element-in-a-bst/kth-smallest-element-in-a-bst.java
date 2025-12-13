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
        int [] kValue={k};
        int [] result={Integer.MIN_VALUE};
        inOrder(root,kValue,result);

        return result[0];
    }

    static void inOrder(TreeNode root, int[] kValue,int [] result)
    {
        
        if(root==null)
        {
            return ;
        }

        
        inOrder(root.left,kValue,result);
        kValue[0]--;
        if(kValue[0]==0)
        {
            result[0]=root.val;
            return;
        }
        if(kValue[0]<0)
        {
            return;
        }
         
        inOrder(root.right,kValue,result);
    }
}