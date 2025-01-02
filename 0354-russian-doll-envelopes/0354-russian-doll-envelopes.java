class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        // sort width by ascending order and also heights by ascending order until a tie
        // appears then sort in descending order if a tie appears
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        // Get heights
        int heights[] = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }
        // Find the Longest Increase subsequence(LIS) of heights (use dp)
        return longLIS(heights);

    }

    public int longLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int length = 0;

        for (int num : nums) {
            // Using Binary search to find position to replace or extend
            int pos = Arrays.binarySearch(dp, 0, length, num);//gives the position to replace 
            if (pos < 0) {
                pos = -(pos + 1);
            }
            dp[pos] = num;
            if (pos == length){
                length++;
            }
        }
        return length;
    }
}