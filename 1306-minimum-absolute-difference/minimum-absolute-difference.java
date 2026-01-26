class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int min_diff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(arr[i]-arr[i-1]);
            if(min_diff>diff)
            {
                list.clear();
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                list.add(pair);
                min_diff=diff;
            }
            else if(min_diff==diff)
            {
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                list.add(pair);
            }
        }

        return list;
    }
}