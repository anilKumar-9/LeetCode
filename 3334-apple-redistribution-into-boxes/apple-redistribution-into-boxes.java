class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0,count=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++)
        {
            sum+=apple[i];
        }

        for(int i=capacity.length-1;i>=0;i--)
        {
            count++;
            sum-=capacity[i];
            if(sum<=0)
            {
                return count;
            }
            
        }
        return 0;
    }

}