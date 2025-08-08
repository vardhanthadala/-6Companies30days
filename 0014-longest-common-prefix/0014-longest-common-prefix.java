class Solution {
    // public String longestCommonPrefix(String[] strs) {
    //     Arrays.sort(strs);
    //     String s1 = strs[0];
    //     String s2 = strs[strs.length-1];
    //     int idx = 0;
    //     while(idx < s1.length() && idx < s2.length()){
    //         if(s1.charAt(idx) == s2.charAt(idx)){
    //             idx++;
    //         } else {
    //             break;
    //         }
    //     }
    //     return s1.substring(0, idx);
    // }
    public String longestCommonPrefix(String[] strs) { // O(matching character) O(1)
        if(strs==null || strs.length==0){
            return "";
        }
        //Find shortest string
        String shortest=strs[0];
        for (String s : strs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        //compare
         for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return shortest.substring(0, i);
                }
            }
        }
        return shortest;//Matched
    }

}