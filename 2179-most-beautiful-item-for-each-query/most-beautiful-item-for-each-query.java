class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n=items.length;
        Arrays.sort(items,(a,b)->{
            return a[0]-b[0];
        });

        int max=items[0][1];
        for(int i=0;i<n;i++)
        {
            max=Math.max(items[i][1],max);
            items[i][1]=max;
        }

        int queryLength=queries.length;

        int []res=new int[queryLength];
        
        for(int i=0;i<queryLength;i++)
        {
            int ans=binarySearch(items,queries[i]);
            res[i]=ans;
        }
        return res;
    }

    static int binarySearch(int [][]items, int target)
    {
        int low=0;
        int high=items.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(items[mid][0]<=target)
            {
                ans=Math.max(ans,items[mid][1]);
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