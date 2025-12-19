/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        serializeHelper(root,sb);

        return sb.toString();
    }

    static void serializeHelper(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            sb.append("#,");
            return ;
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left,sb);
        serializeHelper(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] token=data.split(",");
        int []index=new int[1];

        return deserializeHelper(token,index);
    }

    static TreeNode deserializeHelper(String []token,int []index)
    {
        String val=token[index[0]++];
        if(val.equals("#"))
        {
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=deserializeHelper(token,index);
        node.right=deserializeHelper(token,index);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));