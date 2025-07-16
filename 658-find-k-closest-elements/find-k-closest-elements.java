class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(); 
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        if(k>0)
        {
            pq.offer(arr[i]);
            k--;
        }
        else if(Math.abs(arr[i]-x)<Math.abs(x-pq.peek()))
        {
            pq.poll();
            pq.offer(arr[i]);
        }
    }
    List<Integer> res=new ArrayList<>();
    while(!pq.isEmpty())
    {
        res.add(pq.poll());
    }
    return res;
    }
}