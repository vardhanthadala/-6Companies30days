class Solution {
    public boolean isIsomorphic(String s, String t) {//O(n) O(n)
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char s2 = s.charAt(i);
            char t2 = t.charAt(i);
            if (map.containsKey(s2)) {
                // Check if existing mapping is consistent
                if (map.get(s2) != t2)
                    return false;
            } else {
                // Check if t2 is already used for another char
                if (set.contains(t2))
                    return false;

                map.put(s2, t2); // Create new mapping
                set.add(t2); // Mark ct as used
            }
        }

        return true;
    }
    

    // public boolean isIsomorphic(String s, String t) {
    //     int[] indexS = new int[200];
    //     int[] indexT = new int[200];

    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         if (indexS[s.charAt(i)] != indexT[t.charAt(i)] ){//current inndex of s is different from t
    //             return false;
    //         }

    //         indexS[s.charAt(i)] = i + 1;//update index of current character
    //         indexT[t.charAt(i)] = i + 1;//update index of current character
    //     }
    //     return true;
    // }
}