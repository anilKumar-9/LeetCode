/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode curr, TreeNode p, TreeNode q) {
        if(curr==null)
        {
            return null;
        }
        
        if(curr.val<p.val&&curr.val<q.val)
        {
            return lowestCommonAncestor(curr.right,p,q);
        }
        else if(curr.val>p.val&&curr.val>q.val)
        {
            return lowestCommonAncestor(curr.left,p,q);
        }
        return curr;
    }
}