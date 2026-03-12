class Solution {
    public int makeConnected(int n, int[][] connections) {
        int connectionsLength=connections.length;
        if(connectionsLength<n-1)
        {
            return -1;
        }

        ArrayList<ArrayList<Integer>> adjList = createAdjList(connections,n);
        boolean[]visited=new boolean[n];
        int noOfComponents=0;

        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                dfs(adjList,i,visited);
                noOfComponents++;
            }
        }

        return noOfComponents-1;
    }
    static ArrayList<ArrayList<Integer>> createAdjList(int [][] connections,int n)
    {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int []connection : connections)
        {
            int u=connection[0];
            int v=connection[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adjList , int src,boolean[] visited)
    {
        visited[src]=true;
        for(int neighbour:adjList.get(src))
        {
            if(!visited[neighbour])
            {
                dfs(adjList,neighbour,visited);
            }
        }
    }
}