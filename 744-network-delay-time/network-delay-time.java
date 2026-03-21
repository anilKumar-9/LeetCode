public class Pair{
    int node,distance;
    Pair(int node,int distance)
    {
        this.node=node;
        this.distance=distance;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adjList=createAdjList(n,times);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        int []currentDistance=new int[n+1];
        Arrays.fill(currentDistance,Integer.MAX_VALUE);
        currentDistance[k]=0;
        pq.offer(new Pair(k,0));

        while(!pq.isEmpty())
        {
            boolean flag=true;
            Pair currentPair=pq.poll();
            int distance=currentPair.distance;
            int currentNode=currentPair.node;

            if (distance > currentDistance[currentNode]) continue;

            for(Pair nbr: adjList.get(currentNode))
            {
                int  nbrDistance=nbr.distance;
                int  nbrNode=nbr.node;

                if(nbrDistance+distance<currentDistance[nbrNode])
                {
                    currentDistance[nbrNode]=nbrDistance+distance;
                    pq.offer(new Pair(nbrNode,nbrDistance+distance));
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            int ele=currentDistance[i];
            if(ele==Integer.MAX_VALUE)
            {
                return -1;
            }
            max=Math.max(max,ele);
        }

        return max;
    }

    static ArrayList<ArrayList<Pair>> createAdjList(int n , int [][]times)
    {
        ArrayList<ArrayList<Pair>> adjList=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int []time : times)
        {
            int ui=time[0];
            int vi=time[1];
            int wt=time[2];

            adjList.get(ui).add(new Pair(vi,wt));
        }

        return adjList;
    }
}