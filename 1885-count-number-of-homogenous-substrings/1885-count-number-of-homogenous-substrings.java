class Solution {
    public int countHomogenous(String s) {
        int left = 0;
        long result = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(left) == s.charAt(right)) {
                result += right - left + 1;
            } else {
                result += 1;
                left = right;
            }
        }
       return (int) (result % (1000000007));
    }
}