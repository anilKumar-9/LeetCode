class Solution {
    public List<String> validStrings(int n) {
        List<String> outer=new ArrayList<>();
        generate(n,"",outer);
        return outer;
    }
    static void generate(int n,String curr,List<String> outer)
    {
        if(curr.length()==n)
        {
            outer.add(curr);
            return ;
        }

        if(curr.isEmpty()||curr.charAt(curr.length()-1)!='0')
        {
            generate(n,curr+"0",outer);
        }
        generate(n,curr+"1",outer);
    }
}