class Solution {
    public int[] decimalRepresentation(int n) {
        int len=(int)Math.log10(n)+1;
        if(len==1)
        {
            return new int [] {n};
        }
        ArrayList<Integer> result=new ArrayList<>();
        int power=0;
        while(n>0)
        {
            int rem=n%10;
            int value=rem*(int)Math.pow(10,power);
            if(value!=0)
            {
               result.add(value);
            }
            power++;
            n/=10;
        }
        Collections.reverse(result);
        int []res=new int[result.size()];
        int i=0;
        for(Integer ele: result)
        {
            res[i++]=ele;
        }
        return res;
    }
}