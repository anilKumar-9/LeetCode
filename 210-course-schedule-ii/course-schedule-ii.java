class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList=convertToAdjList(numCourses,prerequisites);
        boolean []pathNode=new boolean[numCourses];
        boolean []vis=new boolean[numCourses];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<numCourses;i++)
        {
            if(!vis[i])
            {
                if(DFS(adjList,vis,pathNode,stack,i)==false)
                {
                    return new int[0]; 
                }
            }
        }
        int []path=new int[numCourses];
        int i=numCourses-1;
        while(!stack.isEmpty())
        {
            path[i--]=stack.pop();
        }
        return path;
    }
    static ArrayList<ArrayList<Integer>> convertToAdjList(int numCourses,int [][]prerequisites)
    {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adjList.add(new ArrayList<>());
        }
        
        for(int []edge :prerequisites)
        {
            int u=edge[0],v=edge[1];
            adjList.get(u).add(v);
        }
        return adjList;
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adjList,boolean [] vis, boolean []pathNode,Stack<Integer> stack, int Node)
    {
        if(vis[Node]==false)
        {
            vis[Node]=true;
            pathNode[Node]=true;
        }
        for(int it: adjList.get(Node))
        {
            if(!vis[it])
            {
                if(DFS(adjList,vis,pathNode,stack,it)==false)
                {
                    return false;
                }
            }
            else if(pathNode[it]==true)
            {
                return false;
            }
        }
        stack.push(Node);
        pathNode[Node]=false;
        return true;
    }
}