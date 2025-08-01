class Solution {
    public int findCircleNum(int[][] isConnected) {
         ArrayList<ArrayList<Integer>> adjList=convertMatToList(isConnected);
         int V=adjList.size();
         boolean []vis=new boolean[V];
         int count=0;
         for(int i=0;i<V;i++)
         {
            if(!vis[i])
            {
                dfs(i,adjList,vis);
                count++;
            }
         }
         return count;
    }
    static ArrayList<ArrayList<Integer>> convertMatToList(int [][] mat)
    {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i!=j&&mat[i][j]==1)
                {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        return adjList;
    }

    static void dfs(int node,ArrayList<ArrayList<Integer>> adjList,boolean []vis)
    {
        vis[node]=true;
        for(int i: adjList.get(node))
        {
            if(!vis[i])
            {
                dfs(i,adjList,vis);
            }
        }
    }
}