class Solution {
    public long flowerGame(int n, int m) {
        long oddn=findOdd(n);
        long evenn=findEven(n);

        long oddm=findOdd(m);
        long evenm=findEven(m);

        return (oddn*evenm)+(oddm*evenn);
    }
    static long findOdd(int x)
    {
        return (long)(x+1)/2;
    }

    static long findEven(int x)
    {
        return (long)(x/2);
    }
}