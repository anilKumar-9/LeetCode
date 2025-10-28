class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3)
        {
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        char []arr=s.toCharArray();
        int count=0;
        int p1=0;
        int p2=0;
        for(p2=0;p2<3;p2++)
        {
            map.put(arr[p2],map.getOrDefault(arr[p2],0)+1);
        }
        if(map.size()==3)
        {
            count++;
        }

        for(p2=3;p2<n;p2++)
        {
            map.put(arr[p1],map.getOrDefault(arr[p1],0)-1);
            if(map.get(arr[p1])<=0)
            {
                map.remove(arr[p1]);
            }
            p1++;
            map.put(arr[p2],map.getOrDefault(arr[p2],0)+1);
            if(map.size()==3)
            {
                count++;
            }
        }
        return count;
    }
}