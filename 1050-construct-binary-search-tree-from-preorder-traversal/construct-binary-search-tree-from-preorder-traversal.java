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
        return insertInto(preorder,new int[1],Integer.MAX_VALUE);
    }
    static TreeNode insertInto(int []preorder,int []i,int bound)
    {
      if(i[0]==preorder.length||preorder[i[0]]>bound)
      {
        return null;
      }
      TreeNode node=new TreeNode(preorder[i[0]++]);
      node.left=insertInto(preorder,i,node.val);
      node.right=insertInto(preorder,i,bound);
      return node;
    }
}