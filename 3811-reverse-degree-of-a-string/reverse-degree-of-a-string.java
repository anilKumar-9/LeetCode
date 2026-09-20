class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int multiplier = 1;
        for(char ch : s.toCharArray())
        {
            sum+=('z'-ch+1)*multiplier;
            multiplier++;
        }

        return sum;
    }
}