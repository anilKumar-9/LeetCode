

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1]; // dp[i][prev+1]

        // Base case is already 0 (since if i == n, LIS = 0)

        for (int i = n - 1; i >= 0; i--) {
            for (int prev = i - 1; prev >= -1; prev--) {
                int notTake = dp[i + 1][prev + 1]; // skip current element
                int take = 0;
                if (prev == -1 || nums[i] > nums[prev]) {
                    take = 1 + dp[i + 1][i + 1]; // include current element
                }
                dp[i][prev + 1] = Math.max(take, notTake);
            }
        }

        return dp[0][0]; // start from i=0, prev=-1 (which maps to index 0)
    }
}
