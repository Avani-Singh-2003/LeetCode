class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount + 1];
        
        // Initialize dp array with a large value
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins are needed to make amount 0
        dp[0] = 0;

        // Iterate over all amounts from 1 to 'amount'
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] is still the large value, return -1
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

    