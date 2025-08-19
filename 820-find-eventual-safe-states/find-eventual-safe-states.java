class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       ArrayList< ArrayList<Integer> > adjList=new ArrayList<>();
       // converting to incoming
       int n=graph.length;
       for(int i=0;i<n;i++)
       {
        adjList.add(new ArrayList<>());
       }
       for(int i=0;i<n;i++)
       {
         for(int it:graph[i])
         {
            adjList.get(it).add(i);
         }
       }
      int []incoming=new int[n];
       for(int i=0;i<n;i++ )
       {
        for(int it: adjList.get(i))
        {
            incoming[it]++;
        }
       }
        Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
            if(incoming[i]==0)
            {
                q.offer(i);
            }
       }
        List<Integer> res=new ArrayList<>();
       while(!q.isEmpty())
       {
        int Node=q.poll();
        res.add(Node);
        for(int it : adjList.get(Node))
        {
            incoming[it]--;
            if(incoming[it]==0)
            {
                q.offer(it);
            }
        }
       }
       Collections.sort(res);
       return res;
    }
}