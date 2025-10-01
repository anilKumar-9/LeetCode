class Solution {
    public int minSetSize(int[] arr) {
        int max=0;
        int n=arr.length;
        for(int ele: arr)
        {
            if(max<ele)
            {
                max=ele;
            }
        }
        int []hash=new int[max+1];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        Arrays.sort(hash);
        int remove=0,elements=0;
        for(int i=max;i>=0;i--)
        {
            remove+=hash[i];
            elements++;
            if(remove>=n/2)
            {
                break;
            }
        }
        return elements;
    }
}