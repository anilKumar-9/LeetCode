class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int n=points.length;
        for(int i=0;i<n;i++)
        {
            int distance=(int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
            pq.offer(new int[]{distance,points[i][0],points[i][1]});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int i=0;
        int [][]res=new int[k][2];
        while(!pq.isEmpty())
        {
            int []arr=pq.poll();
            res[i][0]=arr[1];
            res[i][1]=arr[2];
            i++;
        }
        return res;
    }
}