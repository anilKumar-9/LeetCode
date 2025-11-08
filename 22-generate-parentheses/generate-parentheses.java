class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> outer=new ArrayList<>();
        generateParanthesis(n,"",0,0,outer);
        return outer;
    }
    static void generateParanthesis(int n,String curr,
                                     int open ,int close,
                                    List<String> outer){
        if(curr.length()==2*n)
        {
            outer.add(curr);
            return ;
        }

        if(open<n)
        generateParanthesis(n,curr+"(",open+1,close,outer);

        if(close<open)
        generateParanthesis(n,curr+")",open,close+1,outer);
    }

    static boolean isValidParanthesis(String curr)
    {
        int n=curr.length();
        int balance=0;
        for(int i=0;i<n;i++)
        {
            if(curr.charAt(i)=='(')
            {
                balance++;
            }
            else
            {
                balance--;
            }
            if(balance<0)
            {
                return false;
            }
        }
        return balance==0;
    }
}