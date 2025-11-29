class Solution {

    private static class Pair
    {
        int capital;
        int price;
        Pair(int capital,int price)
        {
            this.capital=capital;
            this.price=price;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        int n=profits.length;
        ArrayList<Pair> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new Pair(capital[i],profits[i]));
        }

        Collections.sort(list,(a,b)->a.capital-b.capital);

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int i=0;
        while(k-->0)
        {
            while(i<n&&w>=list.get(i).capital)
            {
                pq.offer(list.get(i).price);
                i++;
            }

            if(pq.isEmpty())
            {
                return w;
            }

            w+=pq.poll();
        }
        return w;
    }
}