class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int first = -1;
        int second = -1;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {//first mismatch
                    first = i;
                }else if (second == -1) {//second mismatch
                    second = i;
                } else {
                    return false; //Case 1 : More than 2 mismatches
                }
            }
        }
        if (first == -1 && second == -1) {//Case 2 : same strings
            return true;
        }
        if (second == -1) { // Case 3 : only 1 character is difference (Eg : s1 = " bank"  s2 = " yank")
            return false;
        }

        return s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first);
    }
}