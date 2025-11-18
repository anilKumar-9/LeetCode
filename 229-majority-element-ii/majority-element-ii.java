class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list= new ArrayList<>();

        for(Map.Entry<Integer,Integer> it:map.entrySet())
        {
            int key=it.getKey();
            int value=it.getValue();
            if(value>n/3)
            {
                list.add(key);
            }
        }
        Collections.sort(list);

        return list;
    }
}