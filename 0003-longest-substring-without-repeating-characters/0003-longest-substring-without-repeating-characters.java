class Solution {
    public int lengthOfLongestSubstring(String s) {//O(N)  O(N)

        HashMap<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // If the character is already in the map and its last occurrence is within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
            // Move the left pointer to the position after the previous occurrence of the character
             left = map.get(currentChar) + 1;
            }
            map.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}