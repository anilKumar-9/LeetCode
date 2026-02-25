class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)
        {
            return true;
        }
        ArrayList<ArrayList<Integer>> adjList=createAdjList(edges,n);
       
        boolean[] visited=new boolean[n];

        return dfs(adjList,source,destination,visited);
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int src, int dis , boolean[] vis)
    {
        if(src==dis)
        {
            return true;
        }
        vis[src]=true;

        for(int neighbour:adjList.get(src))
        {
            if(!vis[neighbour])
            {
                if(dfs(adjList,neighbour,dis,vis))
                {
                    return true;
                }
            }
        }
        return false;
    }

    static ArrayList<ArrayList<Integer>> createAdjList(int[][] edges 
                                                       ,int V)
    {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int []edge : edges)
        {
            int u=edge[0];
            int v=edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }
}