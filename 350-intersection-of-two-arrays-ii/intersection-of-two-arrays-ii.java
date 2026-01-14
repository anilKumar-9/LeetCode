class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []nums1Count=new int[1001];
        int []nums2Count=new int[1001];
        int n1=nums1.length;
        int n2=nums2.length;

        for(int i=0;i<n1;i++)
        {
            nums1Count[nums1[i]]++;
        }

        for(int i=0;i<n2;i++)
        {
            nums2Count[nums2[i]]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<1001;i++)
        {
            nums1Count[i]=Math.min(nums1Count[i],nums2Count[i]);
            while(nums1Count[i]-->0)
            {
                list.add(i);
            }
        }
        int size=list.size();
        int [] result=new int[size];

        for(int i=0;i<size;i++)
        {
            result[i]=list.get(i);
        }

        return result;
    }
}