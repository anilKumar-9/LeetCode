class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int largest=0;
        int n1=arr1.length;
        for(int i=0;i<n1;i++)
        {
            largest=Math.max(largest,arr1[i]);
        }
        int []count=new int[largest+1];
        for(int i=0;i<n1;i++)
        {
            count[arr1[i]]++;
        }
        int n2=arr2.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n2;i++)
        {
            while(count[arr2[i]]>0)
            {
                res.add(arr2[i]);
                count[arr2[i]]--;
            }
        }
        for(int i=0;i<=largest;i++)
        {
             while(count[i]>0)
            {
                res.add(i);
                count[i]--;
            }
        }
        int []ress=new int[res.size()];
        int i=0;
        for(int ele:res)
            ress[i++]=ele;

        return ress;
    }
}