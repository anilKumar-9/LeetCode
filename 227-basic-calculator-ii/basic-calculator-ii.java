class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int n =s.length();
        int currentNumber=0;
        char operator='+';
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                currentNumber=currentNumber*10+(ch-'0');
            }
           if((ch=='+'||ch=='-'||ch=='*'||ch=='/')||(i==n-1))
            {
                if(operator=='+')
                {
                    st.push(currentNumber);
                }
                else if(operator=='-')
                {
                    st.push(-currentNumber);
                }
                else if(operator=='*')
                {
                    st.push(st.pop()*currentNumber);
                }
                else if(operator=='/')
                {
                    st.push(st.pop()/currentNumber);
                }
                operator=ch;
                currentNumber=0;
            }
        }
        int res=0;
        while(!st.isEmpty())
        {
            res+=st.pop();
            System.out.println(res);
        }
        return res;
    }
}