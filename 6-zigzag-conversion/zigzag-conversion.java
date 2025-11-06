class Solution {
    public String convert(String s, int numRows) {
       int n=numRows;
       int m=s.length();
        List<List<Character>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
       int i=0;

       while(i<m) 
       {
        for(int down=0;down<n&&i<m;down++)
        {
            list.get(down).add(s.charAt(i++));
        }
        for(int up=n-2;up>0&&i<m;up--)
        {
            list.get(up).add(s.charAt(i++));
        }
       }
       StringBuilder sb=new StringBuilder();

       for(i=0;i<list.size();i++)
       {
        for(int j=0;j<list.get(i).size();j++ )
        {
            sb.append(list.get(i).get(j));
        }
       }
       return sb.toString();
    }
}