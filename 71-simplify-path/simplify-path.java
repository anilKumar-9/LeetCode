class Solution {
    public String simplifyPath(String path) {
        String []split=path.split("/");
        Stack<String> st=new Stack<>();
        for(int i=0;i<split.length;i++)
        {
            if(split[i].equals(".")||split[i].equals(""))
            {
                continue;
            }
            if(split[i].equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            {
                st.push(split[i]);
            }
        }
        StringBuilder sb=new StringBuilder();

        while(!st.isEmpty())
        {
            String val="/"+st.pop();
            sb.insert(0,val);
        }
        return sb.length()==0?"/":sb.toString();
    }
}