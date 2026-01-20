class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer> [] digitSums= new PriorityQueue[82];
        for(int i=0;i<82;i++)
        {
            digitSums[i]=new PriorityQueue<>();
        }

        for(int i=0;i<n;i++)
        {
            int sum=digitSum(nums[i]);
            digitSums[sum].add(nums[i]);

            if(digitSums[sum].size()>2)
            {
                digitSums[sum].poll();
            }

        }
        int max=-1;

        for(PriorityQueue<Integer> minHeap:digitSums)
        {
            if(minHeap.size()==2)
            {
                int first=minHeap.poll();
                int second=minHeap.poll();
                max=Math.max(max,first+second);
            }
        }
        return max;
    }

    static int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}