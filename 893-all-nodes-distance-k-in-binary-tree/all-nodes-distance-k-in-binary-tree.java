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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
     Map<TreeNode,TreeNode> map=new HashMap<>();  
     preOrder(map,root,null);
     Set<TreeNode> set=new HashSet<>();
     set.add(target);
     Queue<TreeNode> queue=new LinkedList<>();
     queue.offer(target);

     while(!queue.isEmpty()&&k-->0)
     {
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node=queue.poll();
            TreeNode parent=map.get(node);
            if(!set.contains(parent)&&parent!=null)
            {
                set.add(parent);
                queue.offer(parent);
            }
            if(node.left!=null&&!set.contains(node.left))
            {
                queue.offer(node.left);
                set.add(node.left);
            }
            if(node.right!=null&&!set.contains(node.right))
            {
                queue.offer(node.right);
                set.add(node.right);
            }
        }
     }
     List<Integer> result=new ArrayList<>();

     while(!queue.isEmpty())
     {
        result.add(queue.poll().val);
     }

    return result;
}

    static void preOrder(Map<TreeNode,TreeNode> map
                    ,TreeNode current,TreeNode parent)
    {
        if(current==null)
        {
            return ;
        }

        map.put(current,parent);
        preOrder(map,current.left,current);
        preOrder(map,current.right,current);
    }
}