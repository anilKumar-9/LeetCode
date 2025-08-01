class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            ans.add(row(i));
        }
        return ans;
        
    }
    static List<Integer> row(int row){
     List<Integer> list=new ArrayList<>();
    long ans=1;
    list.add(1);
    for(int col=1;col<row;col++)
    {
        ans*=(row-col);
        ans/=col;
        list.add((int)ans);
    }
    return list;
}
}
