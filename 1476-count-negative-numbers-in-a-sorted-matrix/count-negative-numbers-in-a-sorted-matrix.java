class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            int start=0,end=m-1;
            if(grid[i][end]>=0)
            {
                continue;
            }
            else
            {
                while(start<end&&grid[i][start]>=0)
                {
                    start++;
                }
                count+=end-start+1;
            }
        }
        return count;
    }
}