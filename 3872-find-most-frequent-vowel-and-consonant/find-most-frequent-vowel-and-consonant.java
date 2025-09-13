class Solution {
    public int maxFreqSum(String s) {
      int []arr=new int[26];
      for(int i=0;i<s.length();i++)
      {
        arr[s.charAt(i)-'a']++;
      }
      int vol=0;
      int con=0;
      for(int i=0;i<26;i++)
      {
        if('a'+i=='a'||'a'+i=='e'||'a'+i=='i'||'a'+i=='o'||'a'+i=='u')
        {
            vol=Math.max(vol,arr[i]);
        }
        else
        {
            con=Math.max(con,arr[i]);
        }
      }
      return vol+con;
    }
}