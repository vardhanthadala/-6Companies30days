class Solution {
    //  public boolean check(int[] nums) {
    //     int n=nums.length;
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]<nums[(i-1+n)%n]){
    //             count++;
    //         }if(count>1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public boolean check(int[] nums) {

          int ans = 0, size = nums.length;

        if (nums[0] < nums[size - 1]) {
            ans++;
        }

        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i]) {
                ans++;

                if (ans > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}