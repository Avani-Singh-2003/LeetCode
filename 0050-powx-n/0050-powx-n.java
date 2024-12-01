class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0; 
        if (n == 0) return 1;  
        
        long N = n; 
        if (N < 0) {
            x = 1 / x; 
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) { 
                result *= x; 
            }
            x *= x; 
            N >>= 1; 
        }

        return result;

    }
}