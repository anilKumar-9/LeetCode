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
        preOrder(root,"",list);
        Collections.sort(list);
        return list.get(0);
    }

    static void preOrder(TreeNode root,String str,ArrayList<String> list)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null&&root.right==null)
        {
            str=(char)(root.val+'a')+str;
            list.add(str);
            return ;
        }
        else
        {
            preOrder(root.left,(char)(root.val+'a')+str,list);
            preOrder(root.right,(char)(root.val+'a')+str,list);
        }
    }
}