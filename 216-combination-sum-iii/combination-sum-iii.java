class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> inner=new ArrayList<>();
        combinationHelper(outer,inner,k,n,1);
        return outer;

    }
    static void combinationHelper(List<List<Integer>> outer,ArrayList<Integer> inner,int k,int target,int index)
    {
        if(target==0&&inner.size()==k)
        {
            outer.add(new ArrayList<>(inner));
        }
        if(target<0&&inner.size()>k)
        {
            return ;
        }
        for(int i=index;i<=9;i++)
        {
            inner.add(i);
            combinationHelper(outer,inner,k,target-i,i+1);
            inner.remove(inner.size()-1);
        }
    }
}