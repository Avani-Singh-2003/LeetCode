class Solution {
    public int coinChange(int[] coins, int amount) {
         Map<Integer, Integer> memo = new HashMap<>();
        int result = coinChangeHelper(coins, amount, memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int coinChangeHelper(int[] coins, int amount, Map<Integer, Integer> memo) {
        // Base cases
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        // If already calculated for this amount, return the stored result
        if (memo.containsKey(amount)) return memo.get(amount);

        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {
            int subAns = coinChangeHelper(coins, amount - coin, memo);

            if (subAns != Integer.MAX_VALUE) {
                ans = Math.min(ans, subAns + 1);
            }
        }

        // Store the result in memoization map
        memo.put(amount, ans);
        return ans;
    }
}