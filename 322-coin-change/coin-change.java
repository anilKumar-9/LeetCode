class Solution {
    public int coinChange(int[] coins, int sum) {
        
        int n = coins.length;
        int[][] dp = new int[n][sum + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(coins, sum, n - 1, dp);
        return ans >= 1e9 ? -1 : ans;
    }

    static int solve(int[] coins, int sum, int n, int[][] dp) {

        if (sum == 0) return 0;

        if (n == 0) {
            if (sum % coins[0] == 0)
                return sum / coins[0];
            else
                return (int)1e9;
        }

        if (dp[n][sum] != -1) return dp[n][sum];

        int notTake = solve(coins, sum, n - 1, dp);

        int take = (int)1e9;
        if (coins[n] <= sum) {
            take = 1 + solve(coins, sum - coins[n], n, dp);
        }

        return dp[n][sum] = Math.min(take, notTake);
    }
}
