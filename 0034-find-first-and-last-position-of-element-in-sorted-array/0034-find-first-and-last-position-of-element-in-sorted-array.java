class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result={-1,-1};
        if(nums==null||nums.length==0){
            return result;
        }
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }
    public static int findFirst(int nums[],int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                right=mid-1;
            }else if(nums[mid]<target){
             left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;

    }

    public static int findLast(int nums[],int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}