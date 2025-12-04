class Solution {
    public int maximumSwap(int num) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        int n=(int)Math.log10(num)+1;
        System.out.println(n);
        int []length=new int[n];
        int i=n-1;
        while(num>0)
        {
            length[i--]=num%10;
            num/=10;
        }

        for(i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(length[i]<length[j])
                {
                    if(max<=length[j])
                    {
                        max=length[j];
                        index=j;
                    }
                }
            }
            if(index!=-1)
            {
                int temp=length[i];
                length[i]=length[index];
                length[index]=temp;
                break;
            }
        }
        int ans=0;
        for(i=0;i<n;i++)
        {
            ans=ans*10+length[i];
        }

        return ans;
    }
}