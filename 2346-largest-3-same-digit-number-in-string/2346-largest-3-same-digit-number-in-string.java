class Solution {
    public String largestGoodInteger(String num) {
        String maxDigit = "";

        for (int i = 0; i < num.length() - 2; i++) {
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i + 1);
            char ch3 = num.charAt(i + 2);

            if (ch1 == ch2 && ch2 == ch3) {
                String curr = num.substring(i, i + 3);//three-character substring starting at position i

                if (maxDigit.equals("") || curr.compareTo(maxDigit) > 0) {
                    maxDigit = curr;
                }
            }
        }
        return maxDigit;
    }
}