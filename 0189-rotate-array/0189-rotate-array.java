class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;       //O(n)  O(1)
       k=k%n; //formula to ensure the K is with in the limits of 0 to n
        reverse(nums, 0, n - 1);
          reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}