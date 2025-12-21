class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int n=image.length;
        int m=image[0].length;

        if(image[sr][sc]==color)
        {
            return image;
        }

        int val=image[sr][sc];
        Queue<int []> queue= new LinkedList<>();
        image[sr][sc]=color;
        queue.offer(new int[]{sr,sc});

        int [][] distances={{1,0},{0,1},{-1,0},{0,-1}};

        while(!queue.isEmpty())
        {
            int size=queue.size();

            
            int [] values=queue.poll();
            for(int [] distance: distances)
            {
                int nr=values[0]+distance[0];
                int nc=values[1]+distance[1];

                if(nr>=0&&nr<n&&nc>=0&&nc<m&&image[nr][nc]==val)
                {
                    image[nr][nc]=color;
                    queue.offer(new int[]{nr,nc});
                }
            }

        }

        return image;
    }
}