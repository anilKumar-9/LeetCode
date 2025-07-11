class Solution {
    public boolean isPowerOfThree(int n) {
        if(n%3!=0&&n!=1||n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        boolean ans=isPowerOfThree(n/3);
        if(ans==false)
        return false ;

        return true;
    }
}