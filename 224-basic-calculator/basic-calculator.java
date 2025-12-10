class Solution {
    public int calculate(String s) {
        int num=0,res=0,sign=1;
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch =s.charAt(i);
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='+')
            {
                res+=sign*num;
                sign=1;
                num=0;
            }
            else if(ch=='-')
            {
                res+=sign*num;
                sign=-1;
                num=0;
            }
            else if(ch=='(')
            {
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')')
            {
                res+=sign*num;
                res*=st.pop();
                res+=st.pop();
                num=0;
                sign=1;
            }
            
        }

      
        return res+sign*num;
    }
}