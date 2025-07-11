class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n%2!=0&&n!=1||n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        boolean ans=isPowerOfTwo(n/2);
        return ans;
    }
}