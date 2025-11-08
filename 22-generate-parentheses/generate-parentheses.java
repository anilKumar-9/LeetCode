class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> outer=new ArrayList<>();
        generateParanthesis(n,"",outer);
        return outer;
    }
    static void generateParanthesis(int n,String curr,List<String> outer)
    {
        if(curr.length()==2*n)
        {
            if(isValidParanthesis(curr))
            outer.add(curr);

            return ;
        }

        generateParanthesis(n,curr+"(",outer);
        generateParanthesis(n,curr+")",outer);
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