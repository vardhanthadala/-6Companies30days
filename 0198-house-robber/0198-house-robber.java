class Solution {
    //Recursive approach O(2^n)
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     return f(n - 1, nums);
    // }

    // int f(int idx, int[] nums) {
    //     if (idx == 0)
    //         return nums[idx];
    //     if (idx < 0)
    //         return 0;

    //     int pick = nums[idx] + f(idx - 2, nums);
    //     int notPick = 0 + f(idx - 1, nums);

    //     return Math.max(pick, notPick);
    // }

    //Memoization  O(N) O(N)
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int dp[] = new int[n];
    //     Arrays.fill(dp, -1);

    //     return f(n - 1, nums, dp);
    // }

    // int f(int idx, int[] nums, int dp[]) {
    //     if (idx == 0)
    //         return nums[idx];
    //     if (idx < 0)
    //         return 0;

    //         if(dp[idx]!=-1) return dp[idx];

    //     int pick = nums[idx] + f(idx - 2, nums,dp);
    //     int notPick = 0 + f(idx - 1, nums,dp);

    //     return dp[idx]=Math.max(pick, notPick);
    // }

    //Tabulation O(N) O(N)
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}