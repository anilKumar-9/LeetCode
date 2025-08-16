class Solution {
    public int maximum69Number (int num) {
        int maxNum=0;
        boolean firstSix=false;
        int []arr=new int[(int)Math.log10(num)+1];
        int i=0;
        while(num>0)
        {
            int rem=num%10;
            arr[i]=rem;
            num/=10;
            i++;
        }
        for(i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==6&&firstSix==false)
            {
                maxNum=maxNum*10+9;
                firstSix=true;
                continue;
            }
            maxNum=maxNum*10+arr[i];
        }
        return maxNum;
    }
}