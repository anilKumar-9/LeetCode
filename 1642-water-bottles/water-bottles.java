class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;  // all bottles you can drink initially
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;  // how many you can exchange
            ans += newBottles;                     // add to total drunk
            empty = newBottles + (empty % numExchange); // new empty + leftovers
        }

        return ans;
    }
}
