class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
            set.add(nums1[i]);

         for(int i=0;i<nums2.length;i++)
            set1.add(nums2[i]);

        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!set1.contains(nums1[i]))
            {
                l1.add(nums1[i]);
                set1.add(nums1[i]);
            }
        }
        List<Integer> l2=new ArrayList<>();
         for(int i=0;i<nums2.length;i++)
        {
            if(!set.contains(nums2[i]))
            {
                l2.add(nums2[i]);
                set.add(nums2[i]);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        res.add(l1);
        res.add(l2);
        return res;
    }
}