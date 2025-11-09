class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> inner=new ArrayList<>();
        comboTarget(candidates,target,outer,inner,0);
        return outer;

    }
     static void comboTarget(int []arr,int target,List<List<Integer>> outer,ArrayList<Integer> inner,int i)
     {
        if(target==0)
        {
            outer.add(new ArrayList<>(inner));
        }
        if(target<0)
        {
            return ;
        }

        for(int start=i;start<arr.length;start++)
        {
            inner.add(arr[start]);
            comboTarget(arr,target-arr[start],outer,inner,start);
            inner.remove(inner.size()-1);
        }
     }
}