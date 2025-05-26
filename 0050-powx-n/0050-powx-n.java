class Solution {
    // public double myPow(double x, int n) {//O(logn) O(1)
    //     return Math.pow(x,n);
    // }

    // public double myPow(double x, int n) {//brute force O(N) O(1) Not works for negative X
    // double ans=1;
    // for(int i=0;i<n;i++){
    //     ans=ans*x;
    // }
    // return ans;
    // }

    //     public double myPow(double x, int n) { //binary exponential : O(logn)  space : O(1)  

    //    //  for even n = (x*x) power (n/2) 
    //   //for odd n = (x*x) power  (n-1)

    //         long power = n; // Use long 
    //         if (power < 0) {
    //             x = 1 / x;
    //             power = -power;
    //         }

    //         double result = 1.0;

    //         while (power > 0) {
    //             if ((power % 2) == 1) {//odd
    //                 result *= x;
    //             }
    //             x *= x;
    //             power /= 2;
    //         }

    //         return result;

    //     }

    public double myPow(double x, int n) {//recursive approach

        if (n == 0) {
            return 1;
        }
        // Convert n to a long integer to handle the edge case with Integer.MIN_VALUE
        long N = n;

        // If n is negative, take the reciprocal of x and make N positive
        if (N < 0) {
            N = -N;
            x = 1 / x;

        }
        // If N is even, recursively compute the square of x^(N/2)
        if (N % 2 == 0) {
            return myPow(x * x, (int) (N / 2));
        }

        // If N is odd, recursively compute x^(N-1) and multiply it by x
        else {
            return x * myPow(x, (int) (N - 1));
        }
    }
}