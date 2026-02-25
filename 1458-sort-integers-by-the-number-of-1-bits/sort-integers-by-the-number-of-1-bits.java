class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int []> pq= new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
            return  a[1]-b[1];

            return a[0]-b[0];
        });
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int setBitsCount=0;
            int element=arr[i];
            while(element>0)
            {
                if((element&1)!=0)
                {
                    setBitsCount++;
                }
                element>>=1;
            }
            pq.offer(new int[]{arr[i],setBitsCount});
        }
        int i=0;
        while(!pq.isEmpty())
        {
            int []values=pq.poll();
            arr[i++]=values[0]; 
        }

        return arr;
    }
}