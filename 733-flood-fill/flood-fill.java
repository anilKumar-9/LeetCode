class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        if(image[sr][sc]==color)
        {
            return image;
        }
        int [][] distance={{1,0},{0,-1},{0,1},{-1,0}};
        int val=image[sr][sc];
        image[sr][sc]=color;
        Queue<int []> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int []values=q.poll();
                int row=values[0];
                int col=values[1];
                for(int []dist:distance)
                {
                    int nr=row+dist[0];
                    int nc=col+dist[1];
                    if(nr>=0&&nc>=0&&nr<n&&nc<m&&image[nr][nc]==val)
                    {
                        image[nr][nc]=color;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return image;
    }
}