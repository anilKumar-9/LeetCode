class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0,right=0;
        int n=g.length;
        int m=s.length;
        int count=0;
        while(left<n&&right<m)
        {
           if(s[right]>=g[left])
           {
            left++;
            count++;
           }
           right++;
        }
        return count;
    }
}