class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                list.add(i);
            }
        }
        int []arr=new int[n];
        int arrSize=list.size();
       for(int i=0;i<n;i++)
       {
        int min=Integer.MAX_VALUE;
        for(int j=0;j<arrSize;j++)
        {
            min=Math.min(min,Math.abs(i-list.get(j)));
        }
        arr[i]=min;
       }
       return arr;
    }
}