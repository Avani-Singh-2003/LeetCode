class Solution {
    public int climbStairs(int n) {
       if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int prev2 = 1;  // Number of ways to reach step 1
        int prev1 = 2;  // Number of ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;  // Number of ways to reach step i
            prev2 = prev1;  // Update prev2 to the value of prev1
            prev1 = current;  // Update prev1 to the value of current
        }

        return prev1;

    }
}