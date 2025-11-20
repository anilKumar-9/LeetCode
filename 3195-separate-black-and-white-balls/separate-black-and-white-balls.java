class Solution {
    public long minimumSteps(String s) {
        char []str=s.toCharArray();
        int write=0;
        long total=0;
        int n=str.length;
        for(int scout=0;scout<n;scout++)
        {
            if(str[scout]=='0')
            {
               total+=write;
            }
            else
            {
                write++;
            }
        }
        return total;
    }
}