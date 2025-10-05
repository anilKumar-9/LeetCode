class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=1;i<n;i++)
        {
            pq.offer(nums[i]-nums[i-1]);
        }
        return pq.poll();
    }
}