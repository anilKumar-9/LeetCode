class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
    maxHeap=new PriorityQueue<>((a,b)->b-a);
    minHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty()||num<=maxHeap.peek())
        {
            maxHeap.offer(num);
        }
        else
        {
            minHeap.offer(num);
        }

        if(maxHeap.size()>minHeap.size()+1)
        {
            minHeap.offer(maxHeap.poll());
        }
         if(minHeap.size()>maxHeap.size()+1)
        {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size())
        {
            return maxHeap.peek();
        }
        if(maxHeap.size()<minHeap.size())
        {
            return minHeap.peek();
        }
        double minPoll=minHeap.peek();
        double maxPoll=maxHeap.peek();

        return (minPoll+maxPoll)/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */