    class Pair{
        int node,distance;
        Pair(int node, int distance)
        {
            this.node=node;
            this.distance=distance;
        }
    }

    class Tuple{
        int node,stop,distance;
        Tuple(int node,int distance,int stop)
        {
            this.node=node;
            this.distance=distance;
            this.stop=stop;
        }
    }

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         ArrayList<ArrayList<Pair>> adjList=createAdjList(n,flights);
         int [] distance=new int[n];
         Arrays.fill(distance,Integer.MAX_VALUE);
         distance[src]=0;
         Queue<Tuple> q=new LinkedList<>();

         q.offer(new Tuple(src,0,0));

         while(!q.isEmpty())
         {
            Tuple currentNode=q.poll();
            int node=currentNode.node;
            int currentDistance=currentNode.distance;
            int currentStop=currentNode.stop;

            if(currentStop>k)
            {
                continue;
            }

            for(Pair nbr: adjList.get(node))
            {
                int nbrDistance=nbr.distance;
                int nbrNode=nbr.node;

                int newDistance=currentDistance+nbrDistance;

                if(newDistance<distance[nbrNode]&&currentStop<=k)
                {
                    q.offer(new Tuple(nbrNode,newDistance,currentStop+1));
                    distance[nbrNode]=newDistance;
                }
            }
         }
         
         return distance[dst]==Integer.MAX_VALUE?-1:distance[dst];

    }

    static ArrayList<ArrayList<Pair>> createAdjList(int n , int[][] flights)
    {
        ArrayList<ArrayList<Pair>> adjList=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int [] flight: flights)
        {
            int u=flight[0];
            int v=flight[1];
            int wt=flight[2];
            
            adjList.get(u).add(new Pair(v,wt));
        }

        return adjList;
    }
}