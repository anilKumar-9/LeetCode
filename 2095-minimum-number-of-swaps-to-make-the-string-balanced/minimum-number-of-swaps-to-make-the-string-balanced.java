class Solution {
    public int minSwaps(String s) {
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='[')
            {
                count++;
            }
            else
            {
                if(count>0)
                count--;
            }
            
        }
        return (count+1)/2;
    }
}