class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int key=entry.getKey();
            int value=entry.getValue();
            pq.add(new int[]{value,key});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int []arr=new int[k];
        for(int i=0;i<k;i++)
        {
            int brr[]=pq.poll();
            arr[i]=brr[1];
        }
        return arr;
    }
}