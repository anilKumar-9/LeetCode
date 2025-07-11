class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0||n%4!=0&&n!=1)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        boolean ans=isPowerOfFour(n/4);
        
        if(ans==false)
        {
            return false;
        }
        return true;
    }
}