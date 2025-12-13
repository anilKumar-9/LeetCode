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
    public List<Integer> largestValues(TreeNode root) {
        
       if(root==null)
        {
            return new ArrayList<>();
        }

        List<Integer> maxValues=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
            TreeNode poped=queue.poll();
            if(poped.val>max)
            {
                max=poped.val;
            }
            if(poped.left!=null)
            {
                queue.offer(poped.left);
            }
            if(poped.right!=null)
            {
                queue.offer(poped.right);
            }
            
            }    
        maxValues.add(max);  
     }
        return maxValues;
  }
}