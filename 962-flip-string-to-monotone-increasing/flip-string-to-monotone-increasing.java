class Solution {
    public int minFlipsMonoIncr(String s) {
         int res = 0, cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') cnt ++;
            else if(cnt != 0){
                res++;
                cnt--;
            }
        }
        return res;
    }
}