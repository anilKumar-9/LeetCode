class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        int counter=0;
        for(int i=0;i<costs.length;i++)
        {
            max=Math.max(max,costs[i]);
        }
        int []count=new int[max+1];

        for(int i=0;i<costs.length;i++)
        {
            count[costs[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            while(count[i]>0&&i<=coins)
            {
                coins-=i;
                count[i]--;
                counter++;
            }
        }
        return counter;
    }
}