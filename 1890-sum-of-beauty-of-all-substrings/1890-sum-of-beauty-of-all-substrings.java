class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
             int[] charCount = new int[26];

            for (int j = i; j < n; j++) {
                charCount[s.charAt(j) - 'a']++; 

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int count : charCount) {
                    if (count > 0) {
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }

                sum += maxFreq - minFreq; // Update the sum based on beauty of the current substring
            }
        }

        return sum;
    }
}

