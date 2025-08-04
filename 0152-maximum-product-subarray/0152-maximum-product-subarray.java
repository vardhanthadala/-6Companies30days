class Solution {
    public int maxProduct(int[] nums) {
        // odd negatives product --> negative val
        // even negatives product --> positive val
        // if it has zeros --> answer will be zero
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) { // if product of prefix is 0,then assign prefix with 1 for futher multiplication
                prefix = 1;
            }
            if (suffix == 0) {// if product of suffix is 0,then assign suffix with 1 for futher multiplication
                suffix = 1;
            } 

            prefix = prefix * nums[i];// forward product
            suffix = suffix * nums[n - i - 1];//backward product

            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}