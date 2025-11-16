class Solution {
    public int numSub(String s) {
        int mod=(int)(1e9)+7;
        int noOfSub=0;
        int i=0,j=-1;
        int n=s.length();
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return 0;
        }
        i=j;
        while(j<n)
        {
            if(s.charAt(j)=='0')
            {
                while(j<n&&s.charAt(j)=='0')
                {
                    j++;
                }
                i=j;
            }
            if(j<n&&s.charAt(j)=='1')
            {
                noOfSub%=mod;
                noOfSub+=j-i+1;
                j++;
            }
            
        }
        return noOfSub;
    }
}