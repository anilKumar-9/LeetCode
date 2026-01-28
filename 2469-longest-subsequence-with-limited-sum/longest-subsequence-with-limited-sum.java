class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Arrays.sort(nums);
        int []prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        
        int m=queries.length;
        int []res=new int[m];
        for(int i=0;i<m;i++)
        {
            res[i]=binarySearch(prefix,queries[i]);
        }
        return res;
    }

    static int binarySearch(int [] prefix, int target)
    {
        int n=prefix.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(prefix[mid]<=target)
            {
                ans=mid+1;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return ans;
    }
}