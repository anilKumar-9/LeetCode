class Solution {
    public int hIndex(int[] citations) {
        int max=Integer.MIN_VALUE;
        int n=citations.length;
        for(int i=0;i<n;i++)
        {
            if(citations[i]>max)
            {
                max=citations[i];
            }
        }
        int []hash= new int[max+1];

        for(int i=0;i<n;i++)
        {
            hash[citations[i]]++;
        }
        int count=0;
        for(int i=max;i>=0;i--)
        {
            count+=hash[i];
            if(count>=i)
            {
                return i;
            }            
        }
        return -1;
    }
}