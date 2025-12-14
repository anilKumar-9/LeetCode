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
    public int maxDepth(TreeNode root) {
        return postOrder(root);
    }
    static int postOrder(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=postOrder(root.left);
        int right=postOrder(root.right);

        return 1+Math.max(left,right);
    }
}