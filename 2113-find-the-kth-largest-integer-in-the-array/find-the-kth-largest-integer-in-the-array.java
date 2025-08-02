import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      
       PriorityQueue<BigInteger> pq=new PriorityQueue<>();
        for(String val:nums)
        {
            pq.add(new BigInteger(val));   
        }
        while(pq.size()>k)
        {
            pq.poll();
        }
     return pq.poll().toString();
    }
}