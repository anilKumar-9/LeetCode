class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length-1;
        int m=matrix[0].length-1;
        int top=0,left=0,bottom=n,right=m;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);       
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom&&left<=right)
            {
            
            for(int i=right;i>=left;i--)
            {
                list.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i=bottom;i>=top;i--)
            {
                list.add(matrix[i][left]);
            }
                left++;
            }
        }
        return list;
        
    }
}