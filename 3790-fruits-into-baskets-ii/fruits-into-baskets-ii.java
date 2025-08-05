class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int n=fruits.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j]&&baskets[j]!=Integer.MIN_VALUE)
                {
                    count++;
                    baskets[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    return n-count;
    }
}