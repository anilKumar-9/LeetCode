class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twenty=0;
        int n=bills.length;
        for(int i=0;i<n;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else
                {
                    return false;
                }
            }
            else if(bills[i]==20)
            {
                if(five>0&&ten>0)
                {
                    five--;
                    ten--;
                    twenty++;
                }
                else if(five >=3)
                {
                    five-=3;
                    twenty++;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}