class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int []> list=new ArrayList<>();
        int n=intervals.length;
        for(int []interval:intervals)
        {
            if(list.isEmpty()||list.get(list.size()-1)[1]<interval[0])
            {
                list.add(interval);
            }
            else
            {
                list.get(list.size()-1)[1]=Math.max(interval[1],list.get(list.size()-1)[1]);
            }

        }
        
        return list.toArray(new int[list.size()][]);
    }
}