class Solution {
    Node root=new Node();
    public void insert(int num)
    {
        Node node=root;
        for(int i=31;i>=0;i--)
        {
            int bit=(num>>i)&1;
            if(!node.containsKey(bit))
            {
                node.put(bit,new Node());
            }
            node=node.get(bit);
        }
    }
    public int maximumXor(int num)
    {
        Node node=root;
        int max=0;
        for(int i=31;i>=0;i--)
        {
            int bit=(num>>i)&1;

            if(node.containsKey(1-bit))
            {
                max|=1<<i;
                node=node.get(1-bit);
            }
            else
            {
                node=node.get(bit);
            }
        }
        return max;
    }
    public int findMaximumXOR(int[] nums) {
        for(int num:nums)
        {
            insert(num);
        }
        int maxResult=0;
        for(int num:nums)
        {
            maxResult=Math.max(maxResult,maximumXor(num));
        }
        return maxResult;
    }
    class Node{
        Node []links=new Node[2];

        Node()
        {

        }
        Node get(int bit)
        {
            return links[bit];
        }

        boolean containsKey(int bit)
        {
            return links[bit]!=null;
        }

        void put(int bit, Node node)
        {
            links[bit]=node;
        }
    }
}