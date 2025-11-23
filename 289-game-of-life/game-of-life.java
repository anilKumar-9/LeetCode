class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int [][]dupBoard=new int[n][m];
        int [][]directions={{-1,0},{0,-1},{0,1},{1,0},{-1,-1},
                            {-1,1},{1,1},{1,-1}};

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int lives=0;
                for(int []dir:directions)
                {
                    int x=i+dir[0];
                    int y=j+dir[1];

                    if(x>=0&&x<n&&y>=0&&y<m&&board[x][y]==1)
                    {
                        lives++;
                    }

                }
                if(board[i][j]==1&&(lives<2||lives>3))
                {
                    
                        dupBoard[i][j]=0;
                    
                }

                else if(board[i][j]==0&&lives==3)
                {
                    dupBoard[i][j]=1;
                }

                else
                {
                    dupBoard[i][j]=board[i][j];
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                board[i][j]=dupBoard[i][j];
            }
        }
    }
}