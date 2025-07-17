class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->
        {
        if(a[0]!=b[0])
            return a[0]-b[0];
        else
            return b[1]-a[1];
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int value=entry.getValue();
            int key=entry.getKey();
            pq.offer(new int[]{value,key});
        }
        int i=0;
        int size=pq.size();
        for(int x=0;x<size;x++)
        {
            int []val=pq.poll();
            while(val[0]-->0)
            {
                nums[i++]=val[1];
            }
        }
        return nums;
    }
}