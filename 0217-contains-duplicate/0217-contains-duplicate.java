class Solution {
    //Using SET // O(N) O(N)
    // public boolean containsDuplicate(int[] nums) {  
    //     if(nums==null||nums.length==0){
    //         return false;
    //     }
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int num:nums){
    //         if(set.contains(num)){
    //             return true;
    //         }
    //         set.add(num);
    //     }
    //         return false;

    // }
    public boolean containsDuplicate(int[] nums) {//Using HashMap O(N) O(N)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}