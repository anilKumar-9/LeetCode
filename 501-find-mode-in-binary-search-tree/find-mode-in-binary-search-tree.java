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
    public int[] findMode(TreeNode root) {
        if(root.left==null&&root.right==null)
        {
            return new int[]{root.val};
        }
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int []max ={Integer.MIN_VALUE};
        inOrder(root,map,max);

        for(int key: map.keySet())
        {
            if(map.get(key)==max[0])
            {
                list.add(key);
            }
        }
        int n=list.size();
        int []res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=list.get(n-i-1);
        }
        return res;
    }

    static void  inOrder(TreeNode root,Map<Integer,Integer> map,int [] max)
    {
        if(root==null)
        {
            return ;
        }
                
        inOrder(root.left,map,max);

        map.put(root.val,map.getOrDefault(root.val,0)+1);

        max[0]=Math.max(max[0],map.get(root.val));

        inOrder(root.right,map,max);

    }
}