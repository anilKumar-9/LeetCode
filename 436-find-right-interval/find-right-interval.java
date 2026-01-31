class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int []startArray=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        

        for(int i=0;i<n;i++)
        {
            int start=intervals[i][0];
            map.put(start,i);
            startArray[i]=start;
        }
        Arrays.sort(startArray);
        int []res=new int[n];
        for(int i=0;i<n;i++)
        {
            int end=intervals[i][1];
            int ans=binarySearch(startArray,end);
            res[i] = ans==-1?-1:map.get(startArray[ans]);
        }
        return res;
    }

    static int binarySearch(int []arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}