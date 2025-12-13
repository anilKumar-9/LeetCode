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
    public int getMinimumDifference(TreeNode root) {
        int []min={Integer.MAX_VALUE};
        int []prev={Integer.MAX_VALUE};

        inOrder(root,min,prev);

        return min[0];
    }
    static void inOrder(TreeNode root,int []min,int [] prev)
    {
        if(root==null)
        {
            return;
        }
        
        inOrder(root.left,min,prev);
        int currVal=Math.abs(prev[0]-root.val);
        if(currVal<min[0])
        {
            min[0]=currVal;
        }
        prev[0]=root.val;
        inOrder(root.right,min,prev);
    }
}