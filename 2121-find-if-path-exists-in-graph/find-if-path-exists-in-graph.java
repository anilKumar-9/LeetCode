class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)
        {
            return true;
        }
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++)
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
        boolean[] visited=new boolean[n];
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(source);
        visited[source]=true;
        while(!queue.isEmpty())
        {
            int popElement=queue.poll();
            if(popElement==destination)
            {
                return true;
            }
            for(int neighbour: adjList.get(popElement))
            {
                if(!visited[neighbour])
                {
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                }
            }
        }

        return false;
    }
}