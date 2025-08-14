class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        char []vis=new char[n];
        Arrays.fill(vis,' ');
        for(int i=0;i<n;i++)
        {
            if(vis[i]==' ')
            {
                if(!BFS(graph,i,vis))
                {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean BFS(int [][]graph,int V,char []vis)
    {
        
        vis[V]='B';
        Queue<Integer> q=new LinkedList<>();
        q.offer(V);
        while(!q.isEmpty())
        {
            int index=q.poll();
            for(int val:graph[index])
            {
               if(vis[val]==' ')
               {
                vis[val]=(vis[index]=='B')?'R':'B';
                q.offer(val);
               }
               if(vis[val]==vis[index])
               {
                return false;
               }
            }
        }
        return true;
    }
}