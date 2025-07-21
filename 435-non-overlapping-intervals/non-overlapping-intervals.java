class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prev=0;
        int count=1;
        int n=intervals.length;
        for(int i=1;i<n;i++)
        {
            int start=intervals[i][0];
            
            if(start>=intervals[prev][1])
            {
                prev=i;
                count++;
            }
        }
        return n-count;
    }
}