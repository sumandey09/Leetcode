class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount + 1];
        
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int coin : coins) {
            for (int t = coin; t <= amount; t++) {
                dp[t] = Math.min(dp[t], 1 + dp[t - coin]);
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
