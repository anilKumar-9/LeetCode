class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt=new Stack<>();
        Stack<StringBuilder> strSt=new Stack<>();
        int n=s.length();
        int currentNumber=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            
            if(Character.isDigit(ch))
            {
                currentNumber=currentNumber*10+(ch-'0');
            }
            else if(ch=='[')
            {
                numSt.push(currentNumber);
                currentNumber=0;
                strSt.push(sb);
                sb=new StringBuilder();
            }
            else if(ch==']')
            {
                int count=numSt.pop();
                StringBuilder temp=sb;
                sb=strSt.pop();
                for(int i=0;i<count;i++)
                {
                    sb.append(temp);
                }
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}