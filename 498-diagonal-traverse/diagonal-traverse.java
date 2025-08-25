class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [] res=new int[n*m];
        int k=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int d=0;d<n+m-1;d++)
        {
            list.clear();
            int row=d<m?0:d-m+1;
            int col=d<m?d:m-1;

            while(row<n&&col>-1)
            {
                list.add(mat[row++][col--]);
            }

            if(d%2==0)
            {
                Collections.reverse(list);
            }
            for(int i=0;i<list.size();i++)
            {
                res[k++]=list.get(i);
            }
        }
        return res;
    }
}