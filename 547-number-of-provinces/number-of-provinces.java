class Solution {
    public int findCircleNum(int[][] isConnected) {
         int V=isConnected.length;
         boolean []vis=new boolean[V];
         int count=0;
         for(int i=0;i<V;i++)
         {
            if(!vis[i])
            {
                dfs(i,isConnected,vis);
                count++;
            }
         }
         return count;
    }
    
    static void dfs(int node,int[][] isConnected ,boolean []vis)
    {
        vis[node]=true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!vis[i]&&isConnected[node][i]==1)
            {
                dfs(i,isConnected,vis);
            }
        }
    }
}