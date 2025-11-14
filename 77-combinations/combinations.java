class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> inner =new ArrayList<>();
        combinations(1,n+1,k,outer,inner);
        return outer;
    }
    static void combinations(int i,int n,int k ,
                        List<List<Integer>> outer,List<Integer> inner)
    {
        if(inner.size()==k)
        {
            outer.add(new ArrayList<>(inner));
        }

        for(int ind=i;ind<n;ind++)
        {
            inner.add(ind);
            combinations(ind+1,n,k,outer,inner);
            inner.remove(inner.size()-1);
        }
    }
}