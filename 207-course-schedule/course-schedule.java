class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList=convertToAdjList(prerequisites,numCourses);
        boolean vis[]=new boolean[numCourses];
        boolean pathNode[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!vis[i])
            {
                if(DFS(adjList,vis,pathNode,i)==false)
                {
                    return false;
                }
            }

        }
        return true;
    }

    static ArrayList<ArrayList<Integer>> convertToAdjList(int [][] prerequisites,int numCourses)
    {
         ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
         for(int i=0;i<numCourses;i++)
         {
            adjList.add(new ArrayList<>());
         }
         for(int [] pre:prerequisites)
         {
            int u=pre[0],v=pre[1];
            adjList.get(u).add(v);
         }
         return adjList;
    }
static boolean DFS( ArrayList<ArrayList<Integer>> adjList,boolean []vis,boolean []pathNode,int Node)
{
    if(vis[Node]==false)
    {
        vis[Node]=true;
        pathNode[Node]=true;
    }
    for(int it: adjList.get(Node))
    {
        if(vis[it]==false)
        {
            if(DFS(adjList,vis,pathNode,it)==false)
            {
                return false;
            }

            
        }
        else if(pathNode[it]==true)
            {
                return false;
            }
    }
    pathNode[Node]=false;
    return true;
} 
 }