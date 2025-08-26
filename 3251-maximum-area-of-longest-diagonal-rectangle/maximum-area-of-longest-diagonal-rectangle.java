class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double sqr=0;
        int index=-1;
        int maxArea=-1;
        int n=dimensions.length;

        for(int [] dimension: dimensions)
        {
            int l=dimension[0];
            int w=dimension[1];
            int diasq=l*l+w*w;
            int area=l*w;
            if(diasq>sqr)
            {
                maxArea=area;
                sqr=diasq;
            }
            else if(diasq==sqr)
            {
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}