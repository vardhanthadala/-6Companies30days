class Solution {
    public int minMoves2(int[] nums) {//  Tc-O(nlogn) Sc-O(1)
        Arrays.sort(nums);
        int operations = 0;
        int mid = nums[nums.length / 2];
        for (int num : nums) {
            operations += Math.abs(mid - num);
        }
        return operations;
    }
}