class Solution {
    public int minCost(int n, int[] cuts) {
        int cutSize=cuts.length;
        int [][]dp=new int[cutSize+2][cutSize+2];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        int []addedCuts=new int[cutSize+2];
        for(int i=0;i<cutSize;i++)
        {
            addedCuts[i+1]=cuts[i];
        }
        addedCuts[cutSize+1]=n;
        Arrays.sort(addedCuts);
        return minCuts(1,cutSize,addedCuts,dp,cutSize);
    }
    static int minCuts(int i,int j,int []cuts,int [][]dp,int n)
    {
        if(i>j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int mini=Integer.MAX_VALUE;
        for(int ind=i;ind<=j;ind++)
        {
            int steps=-cuts[i-1]+cuts[j+1]+minCuts(i,ind-1,cuts,dp,n)+minCuts(ind+1,j,cuts,dp,n);
            mini=Math.min(mini,steps);
        }

        return dp[i][j]=mini;
    }
}