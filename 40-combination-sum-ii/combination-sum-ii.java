class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> inner=new ArrayList<>();
        Arrays.sort(arr);
        helper(0,arr,target,outer,inner);
        return outer;
    }
    static void helper(int ind,int []arr,int target,List<List<Integer>> outer,ArrayList<Integer> inner)
    {
        if(target==0){
            outer.add(new ArrayList<>(inner));
            return;
        }
        if(target<0)
        {
            return ;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>0&&i>ind&arr[i]==arr[i-1])
            {
                continue;
            }

            inner.add(arr[i]);
            helper(i+1,arr,target-arr[i],outer,inner);
            inner.remove(inner.size()-1);
        }
    }
}