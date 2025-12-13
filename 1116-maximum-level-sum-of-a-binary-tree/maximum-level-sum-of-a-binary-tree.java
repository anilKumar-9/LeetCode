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
    public int maxLevelSum(TreeNode root) {
    if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        long  max=Integer.MIN_VALUE;
        int maxLevel=1;
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty())
        {
            level++; 
            int size=queue.size();
            long sum=0;
        for(int i=0;i<size;i++)
        {
            TreeNode poped=queue.poll();
            sum+=poped.val;

            
            if(poped.left!=null)
            {
                queue.offer(poped.left);
            }
            if(poped.right!=null)
            {
                queue.offer(poped.right);
            }
            
         } 
         if(sum>max)
            {
                max=sum;
                maxLevel=level;
            }
              
     }
        return maxLevel;
  }
}