class Solution {
    public List<String> summaryRanges(int[] nums) {
       int n=nums.length;

       List<String> res=new ArrayList<>();
       if(n<=0)
       {
        return res;
       }
       int start=0;
       int end=0;
       String ans="";
       for(int i=1;i<n;i++)
       {
         if(nums[i]==nums[end]+1)
         {
            end=i;
         }
         else
         {
            if(start!=end)
            {
            ans=nums[start]+"->"+nums[end];
            res.add(ans);
            }
            else
            {
                ans=""+nums[start];
                res.add(ans);
            }
            start=i;
            end=i;
         }
       }
        if(start!=end)
            {
              ans=nums[start]+"->"+nums[end];
              res.add(ans);
            }
            else
            {
                ans=""+nums[start];
                res.add(ans);
            }


    return res;
    }
}