class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
            {
                int key=nums[i];
                int positiveValue=key+k;
                int negitiveValue=key-k;

                if(map.containsKey(positiveValue))
                {
                    count+=map.get(positiveValue);
                }
                if(map.containsKey(negitiveValue))
                {
                    count+=map.get(negitiveValue);
                }
                map.put(key,map.getOrDefault(key,0)+1);
            }
        return count;
    }
}