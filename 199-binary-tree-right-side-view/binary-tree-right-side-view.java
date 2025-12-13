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
    static class Pair{
        TreeNode root;
        int level;
        Pair(TreeNode root,int level)
        {
            this.root=root;
            this.level=level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Pair> queue=new LinkedList<>();

        
        int level=0;
        queue.offer(new Pair(root,level));
        while(!queue.isEmpty())
        {
            level++;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                Pair values=queue.poll();
                if(!map.containsKey(values.level))
                {
                    map.put(values.level,values.root.val);
                }
                if(values.root.right!=null)
                {
                    queue.offer(new Pair(values.root.right,level));
                }

                if(values.root.left!=null)
                {
                    queue.offer(new Pair(values.root.left,level));
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int value:map.values())
        {
            result.add(value);
        }

        return result;
    }
}