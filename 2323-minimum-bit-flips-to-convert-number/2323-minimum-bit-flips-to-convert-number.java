class Solution {
    // public int minBitFlips(int start, int goal) {
    //     return Integer.bitCount(start ^ goal);
    // }
    public int minBitFlips(int start, int goal){
        int num=start^goal;
        int ones=0;

        while(num!=0){
            num=num&(num-1);
            ones++;
        }
        return ones;
    }
}