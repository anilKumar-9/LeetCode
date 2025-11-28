class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
            {
                char [] ch=strs[i].toCharArray();
                Arrays.sort(ch);
                String key=new String(ch);

                if(!map.containsKey(key))
                {
                    List<String> val=new ArrayList<>();
                    val.add(strs[i]);
                    map.put(key,val);
                }
                else
                {
                    map.get(key).add(strs[i]);
                }
            }

        return new ArrayList<>(map.values());
    }
}