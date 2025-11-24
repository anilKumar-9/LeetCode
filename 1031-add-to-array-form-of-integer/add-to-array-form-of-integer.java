class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=num.length;
        List<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            int sum=num[i]+k;
            list.add(sum%10);
            k=sum/10;
        }

        while(k>0)
        {
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}