class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        int i=0,j=0;
        int count=0;
        ArrayList<Character> list=new ArrayList<>();
        while(j<n)
        {
           
            if(num.charAt(i)==num.charAt(j))
            {
                j++;
                count++;
            }
            else
            {
                i=j;
                count=0;
            }
             if(count==3)
            {
                list.add(num.charAt(i));
            }
        }
        int size=list.size();
        if(size==0)
        {
            return "";
        }
        
        Collections.sort(list);
        char max=list.get(list.size()-1);
        String ans="";
        for( i=0;i<3;i++)
        {
            ans+=max;
        }
        return ans;
    }
}