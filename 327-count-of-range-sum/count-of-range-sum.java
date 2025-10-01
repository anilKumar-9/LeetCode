class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n=nums.length;
        long []prefix=new long[n+1];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+nums[i];
        }
        return mergeSort(0,n,prefix,lower,upper);
    }

    static int mergeSort(int low,int high, long []prefix, int lower, int upper)
    {
        
        if(low>=high)
        {
            return 0;
        }
            int mid=low+(high-low)/2;
            int count=mergeSort(low,mid,prefix,lower,upper)+mergeSort(mid+1,high,prefix,lower,upper);
            int j=mid+1,k=mid+1;
            for(int i=low;i<=mid;i++)
            {
                while(j<=high&&prefix[j]-prefix[i]<lower)
                {
                    j++;
                }
                while(k<=high&&prefix[k]-prefix[i]<=upper)
                {
                    k++;
                }
                count+=(k-j);
            }
            merge(low,mid,high,prefix);
        return count;

    }
    static void  merge(int low,int mid,int high, long []prefix)
    {
        int i=low,j=mid+1;
        ArrayList<Long> list=new ArrayList<>();
        while(i<=mid&&j<=high)
        {
            if(prefix[i]<=prefix[j])
            {
                list.add(prefix[i++]);
            }
            else
            {
                list.add(prefix[j++]);
            }
        }
        while(i<=mid)
        {
            list.add(prefix[i++]);
        }
        while(j<=high)
        {
             list.add(prefix[j++]);
        }
        for(i=low;i<=high;i++)
        {
            prefix[i]=list.get(i-low);
        }
    }
} 