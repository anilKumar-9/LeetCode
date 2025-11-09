class Solution {
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        String []map={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int index=0;
        generateDigits(n,digits,sb,res,index,map);
        return res;
    }
    static void generateDigits(int n,String digits,StringBuilder sb
                                ,List<String> res,int index,String []map){
        
        if(index==n)
        {
            res.add(sb.toString());
            return ;
        }
        String letters=map[digits.charAt(index)-'2'];

        for(char c:letters.toCharArray())
        {
            sb.append(c);
            generateDigits(n,digits,sb,res,index+1,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}