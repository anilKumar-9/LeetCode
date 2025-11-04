class Solution {
    public String intToRoman(int num) {
        int []decimalValues={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValues={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(num>0&&i<13)
        {
            while(num>0&&num>=decimalValues[i])
            {
                sb.append(romanValues[i]);
                num-=decimalValues[i];
            }
            i++;
        }
        return sb.toString();
    }
}