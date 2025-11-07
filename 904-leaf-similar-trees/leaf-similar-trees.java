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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1.left==null&&root1.right==null
          &&root2.left==null&&root2.right==null)
        {
            return root1.val==root2.val;
        }

        ArrayList<Integer> leftLeafs=new ArrayList<>();
        ArrayList<Integer> rightLeafs=new ArrayList<>();

        leafValues(root1,leftLeafs);
        leafValues(root2,rightLeafs);

        if(leftLeafs.size()!=rightLeafs.size())
        {
            return false;
        }
        int size=leftLeafs.size();

        for(int i=0;i<size;i++)
        {
            System.out.println(" "+leftLeafs.get(i)+" "+rightLeafs.get(i));
           if (!leftLeafs.get(i).equals(rightLeafs.get(i))) {
    return false;
}

        }
        return true;
    }

    static void leafValues(TreeNode root,ArrayList<Integer> list)
    {
            if(root==null)
                {
                  return ;
                }
         if(root.left==null&&root.right==null)
        {
            list.add(root.val);
            return;
        }
        leafValues(root.left,list);
        leafValues(root.right,list);
        
    }
}