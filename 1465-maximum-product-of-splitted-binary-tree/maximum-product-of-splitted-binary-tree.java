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
    public int maxProduct(TreeNode root) {
     
        long max=0;
        long total=subTreeTotal(root);
      
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty())
        {
            TreeNode node=queue.poll();
            if(node==null)
            {
                continue;
            }
            long value=node.val;
            max=Math.max((total-value)*value,max);
            if(node.left!=null)
            {
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                queue.offer(node.right);
            }
        }

        return (int)(max%(long)(1e9+7));
    }

    static long subTreeTotal(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        return root.val+=subTreeTotal(root.left)+subTreeTotal(root.right);    
    }

    }

  