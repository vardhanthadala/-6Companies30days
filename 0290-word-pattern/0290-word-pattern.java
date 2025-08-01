class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                //Existing pattern must map to same word not to other word
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                // word is already assigned to a different char
                if (set.contains(word)) {
                    return false;
                }
                map.put(c, word);// Assign the pattern char to word
                set.add(word);  //Mark word as used
            }

        }
        return true;

    }
}