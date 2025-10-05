class Solution {
    public String customSortString(String order, String s) {
        int n=s.length();
        Character []hash=new Character[n];
        for(int i=0;i<n;i++)
        {
            hash[i]=s.charAt(i);
        }
        String res="";
        Arrays.sort(hash,(a,b)->{
           return  order.indexOf(a)-order.indexOf(b);
        });
        for(int i=0;i<hash.length;i++)
        {
            res+=hash[i];
        }
        return res;
    }
}