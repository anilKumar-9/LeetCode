class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int alice=0,bob=plants.length-1,tempcapA=capacityA,tempcapB=capacityB;
        int refill=0;
        while(alice<bob)
        {
            if(plants[alice]>tempcapA)
            {
                tempcapA=capacityA;
                refill++;
                
            }
            tempcapA-=plants[alice];
            alice++;

            if(plants[bob]>tempcapB)
            {
                tempcapB=capacityB;
                refill++;
            }
            tempcapB-=plants[bob];
            bob--;
        }
        if(alice==bob)
        {
            if(Math.max(tempcapA,tempcapB)<plants[alice])
            refill++;
        }
        return refill;
    }
}