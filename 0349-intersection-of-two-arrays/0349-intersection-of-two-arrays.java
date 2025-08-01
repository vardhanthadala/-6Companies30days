class Solution {

    //HashMap O(n+m) O(n+m)

    // public int[] intersection(int[] nums1, int[] nums2) {
    //     Map<Integer, Boolean> map = new HashMap<>();
    //     List<Integer> result = new ArrayList<>();

    //     for (int num : nums1) {
    //         map.put(num, true);//true means the element is in nums1
    //     }

    //     for (int num : nums2) {
    //         if (map.getOrDefault(num, false)) {
    //             result.add(num);
    //             map.put(num, false); // Mark as already added
    //         }
    //     }

    //     int[] output = new int[result.size()];
    //     for (int i = 0; i < result.size(); i++) {
    //         output[i] = result.get(i);
    //     }

    //     return output;
    // }


    //set O(n+m) O(n+m)

    // public int[] intersection(int[] nums1, int[] nums2) {
    //     Set<Integer> set1 = new HashSet<>();
    //     Set<Integer> result = new HashSet<>();

    //     for (int num : nums1) {
    //         set1.add(num);
    //     }

    //     for (int num : nums2) {
    //         if (set1.contains(num)) {
    //             result.add(num);
    //         }
    //     }

    //     int[] output = new int[result.size()];
    //     int i = 0;
    //     for (int num : result) {
    //         output[i++] = num;
    //     }

    //     return output;
    // }

    //Optimal approach using 2 pointers  Time - O(n log n + m log m)  space - O(1) while ignoring output list
    public int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1); 
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            // Skipping duplicates in nums1
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        // convert list to array
        int[] output = new int[result.size()];
        for (int idx = 0; idx < result.size();idx ++) {
            output[idx] = result.get(idx);
        }

        return output;
   
    }
}