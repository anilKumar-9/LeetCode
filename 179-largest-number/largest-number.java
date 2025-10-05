class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String []hash=new String[n];
        for(int i=0;i<n;i++)
        {
            hash[i]=""+nums[i];
        }
        Arrays.sort(hash,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        if(hash[0].equals("0"))
        {
            return "0";
        }
        String ans="";
        for(int i=0;i<n;i++)
        {
            ans+=hash[i];
        }
        return ans;
    }
}