class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<int []> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
                q.offer(new int[]{i,0});
                 board[i][0]='T';
            }
            if(board[i][m-1]=='O')
            {
                q.offer(new int[]{i,m-1});
                 board[i][m-1]='T';
            }
        }
        for(int j=1;j<m-1;j++)
        {
            if(board[0][j]=='O')
            {
                q.offer(new int[]{0,j});
                 board[0][j]='T';
            }
            if(board[n-1][j]=='O')
            {
                q.offer(new int[]{n-1,j});
                 board[n-1][j]='T';
            }
        }


        int [][] distance={{1,0},{0,1},{0,-1},{-1,0}};
        while(!q.isEmpty())
        {
            int []val=q.poll();
            int row=val[0];
            int col=val[1];
            for(int []dist:distance)
            {
                int nr=row+dist[0];
                int nc=col+dist[1];
                if(nr>=0&&nc>=0&&nr<n&&nc<m&&board[nr][nc]=='O')
                {
                    board[nr][nc]='T';
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='T')
                {
                     board[i][j]='O';
                }
            }
        }
    }
}