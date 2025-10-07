class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix=new int[n][n];
        int top=0,left=0,bottom=n-1,right=n-1;
        List<Integer> list=new ArrayList<>();
        int x=1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                matrix[top][i]=x++;       
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
              matrix[i][right]=x++;
            }
            right--;
            if(top<=bottom&&left<=right)
            {
            
            for(int i=right;i>=left;i--)
            {
                matrix[bottom][i]=x++;
            }
            bottom--;

            for(int i=bottom;i>=top;i--)
            {
                matrix[i][left]=x++;
            }
                left++;
            }
        }
        return matrix;
        
    }
}