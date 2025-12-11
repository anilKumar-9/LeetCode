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
    public String smallestFromLeaf(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        preOrder(root,sb,list);
        Collections.sort(list);
        return list.get(0);
    }

    static void preOrder(TreeNode root,StringBuilder str,ArrayList<String> list)
    {
        if(root==null)
        {
            return ;
        }
        str.insert(0,(char)(root.val+'a'));
        if(root.left==null&&root.right==null)
        {
            list.add(new String(str));
            str.deleteCharAt(0);
            return ;
        }
        else
        {
            preOrder(root.left,str,list);
            preOrder(root.right,str,list);
        }

        str.deleteCharAt(0);
    }
}