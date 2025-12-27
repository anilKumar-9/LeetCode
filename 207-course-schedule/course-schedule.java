class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] parent=new boolean[numCourses];
        boolean[] visited=new boolean[numCourses];
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<numCourses;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++)
        {
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                if(!dfs(adjList,visited,parent,i))
                {
                    return false;

                }
            }
        }
        return true;
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adjList, boolean [] parent,boolean [] visited,int index)
    {
        parent[index]=true;
        visited[index]=true;

        for(int it:adjList.get(index))
        {
            if(!visited[it])
            {
                if(!dfs(adjList,parent,visited,it))
                {
                    return false;
                }

            }
            else if(parent[it]==true)
            {
                return false;
            }
        }
        parent[index]=false;
        return true;
    }

}