class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int[] connected=new int[n*n+1];
        Arrays.fill(connected,-1);
        boolean flag=true;
        int node=1;
        for(int i=n-1;i>=0;i--)
        {
            if(flag)
            {
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]!=-1)
                    {
                        connected[node]=board[i][j];
                    }
                    node++;
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    if(board[i][j]!=-1)
                    {
                        connected[node]=board[i][j];
                    }
                    node++;
                }
            }

            flag=!flag;
        }

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=1;i<=n*n;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int i=1;i<=n*n-1;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(i+j<=n*n)
                {
                    if(connected[i+j]!=-1)
                    {
                        adjList.get(i).add(connected[i+j]);
                    }
                    else
                    {
                        adjList.get(i).add(i+j);
                    }
                }
            }
        }

        boolean [] visited=new boolean[n*n+1];

        Queue<Integer> queue =new LinkedList<>();

        queue.offer(1);
        visited[1]=true;
        int level=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            while(size-->0)
            {
                int element=queue.poll();
                if(element==n*n)
                {
                    return level;
                }
                for(int nbr:adjList.get(element))
                {
                    if(!visited[nbr])
                    {
                        queue.offer(nbr);
                        visited[nbr]=true;
                    }
                }
            }
            level++;
        }

        return -1;
    }
}