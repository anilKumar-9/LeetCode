class Solution {
    public int[] productExceptSelf(int[] arr) {
       
        int n=arr.length;
        int index=-1,zeros=0,prod=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
                index=i;
            }
            else
            {
                prod=prod*arr[i];
            }
        }
        int []res=new int[n];
        if(zeros==0)
        {
            for(int i=0;i<n;i++)
            {
                res[i]=prod/arr[i];
            }
        }
        else if(zeros==1)
        {
            res[index]=prod;
        }
    return res;
    }
}