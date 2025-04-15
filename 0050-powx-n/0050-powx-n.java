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

    //binary exponential : O(logn)  space : O(1)

  
    public double myPow(double x, int n) {

   //  for even n = (x*x) power (n/2) 
  //for odd n = (x*x) power  (n-1)

        long power = n; // Use long to handle n = Integer.MIN_VALUE safely
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power % 2) == 1) {//odd
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;

    }
}