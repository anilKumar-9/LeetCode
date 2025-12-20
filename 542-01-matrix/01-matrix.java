class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        Queue<int []> queue=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    
                    mat[i][j]=Integer.MAX_VALUE;
                }
                else
                {
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int [][] directions={{1,0},{0,1},{-1,0},{0,-1}};

        while(!queue.isEmpty())
        {
            int []values=queue.poll();
            int r=values[0];
            int c=values[1];
            for(int [] direction:directions)
            {
                int nr=direction[0]+r;
                int nc=direction[1]+c;

                if(nr>=0&&nr<n&&nc>=0&&nc<m)
                {
                    if(mat[nr][nc]>(mat[r][c]+1))
                    {
                    mat[nr][nc]=mat[r][c]+1;
                    queue.offer(new int[]{nr,nc});
                    }
                }
            }

        }

        return mat;
    }
}