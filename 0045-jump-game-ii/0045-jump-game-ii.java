class Solution {//Range based Greedy Approach
    public int jump(int[] nums) {
        int n = nums.length;

        int jumps = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < n - 1; i++) {
            l = Math.max(l, i + nums[i]);

            if (i == r) {
                r = l;
                jumps++;
            }
        }
        return jumps;
    }
}