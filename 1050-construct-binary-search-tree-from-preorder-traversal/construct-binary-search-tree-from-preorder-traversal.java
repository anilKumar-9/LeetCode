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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
            root=insertInto(root,preorder[i]);
        }
        return root;
    }
    static TreeNode insertInto(TreeNode root,int n)
    {
        if(root==null)
        {
            return new TreeNode(n);
        }
        if(n<=root.val)
        {
            root.left=insertInto(root.left,n);
        }
        else
        {
            root.right=insertInto(root.right,n);
        }
        return root;
    }
}