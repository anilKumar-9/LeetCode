class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(!set.contains(entry.getValue())||set.isEmpty())
            {
                set.add(entry.getValue());
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}