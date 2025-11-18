class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int low=0;
        int high=n-1;
        int count=0;
        while(low<=high)
        {
            int sum=people[low]+people[high];

            if(sum<=limit)
            {
                count++;
                low++;
                high--;
            }
            else
            {
                count++;
                high--;
            }

        }
        return count;
    }
}