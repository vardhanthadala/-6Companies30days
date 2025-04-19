class Solution {//DP-space optimization O(N) O(1)
    public int rob(int[] nums) {
        int n = nums.length;
        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];
        if (n == 1)
            return nums[0];
        for (int i = 0; i < n; i++) {
            if (i != 0)//except first element (excluding first element)
                temp1[i - 1] = nums[i];
            if (i != n - 1)//except last element(excluding last element)
                temp2[i] = nums[i];
        }

        int ans1 = solve(temp1);
        int ans2 = solve(temp2);

        return Math.max(ans1, ans2);
    }

    private int solve(int[] nums) {  //House robber-1 code
        int prev1 = nums[0];
        int prev2 = 0;

        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i];
            if (i > 1) {
                pick += prev2;
            }
            int nonPick = prev1;
            int curr_i = Math.max(pick, nonPick);
            prev2 = prev1;
            prev1 = curr_i;
        }
        return prev1;
    }
}