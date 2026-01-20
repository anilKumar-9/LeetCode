class Solution {
    public int countLargestGroup(int n) {
        int []digitSums=new int[37];
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int digit=0;
            for(int j=i;j>0;j=j/10)
            {
                digit+=j%10;
            }
            digitSums[digit]++;
            max=Math.max(digitSums[digit],max);
        }

        int count=0;

        for(int i=1;i<37;i++)
        {
            if(digitSums[i]==max)
            {
                count++;
            }
        }
        return count;
    }
}