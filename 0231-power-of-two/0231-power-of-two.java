class Solution {
    public boolean isPowerOfTwo(int n) {
        /*Step 1 : Convert num to binary
        Step 2 : check for no.of 1 bits ...
          if no.of one bits ==1 then TRUE(num is power of 2)
           else FALSE

           Ex: n=16  --> 10000 
           n-1 = 15  -->01111

           using and operator 
            10000
          & 01111
        ------------
            00000  --> TRUE
        -----------

        */


     return n>0 && (n & (n-1))==0; 
                          
        
    }
}