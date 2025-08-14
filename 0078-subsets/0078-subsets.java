class Solution { // 2 solns (1.recursion,2.bit manipulation)
    //     List<List<Integer>> ans=new ArrayList<>();

    //     public List<List<Integer>> subsets(int[] nums) {
    //         int n = 0;
    //         List<Integer> al = new ArrayList<>(); 
    //         allcases(nums, ans, n, al);
    //         return ans;
    //     }

    //     public void allcases(int[] nums, List<List<Integer>> ans, int n, List<Integer> al) {
    //         if (n == nums.length) {
    //             ans.add(new ArrayList<>(al));
    //             return;
    //         }
    //         al.add(nums[n]);
    //         allcases(nums, ans, n + 1, al);
    //         al.remove(al.size() - 1);
    //         allcases(nums, ans, n + 1, al);
    //         return;
    //     }
    // }

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n;//1<<n --> number of subsets i.e .., 2^n subsets
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { //This checks if the j-th bit in the number i is set to 1
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}