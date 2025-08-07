class Solution {
    // public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     StringBuilder a = new StringBuilder();// O(n+m)  O(n+m)
    //     StringBuilder b = new StringBuilder();
    //     for (String s : word1) {
    //         a.append(s);
    //     }
    //     for (String s : word2) {
    //         b.append(s);
    //     }

    //     return a.toString().equals(b.toString());
    // }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {//O(n) O(1)
        int i = 0, j = 0;//pointers for word1 and word2 arrays
        int x = 0, y = 0;//pointers for characters in each word

        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(x) != word2[j].charAt(y)) {
                return false;
            }
            //Move to next character in word1[i]
            x++;
            if(x==word1[i].length()){
                x=0;
                i++;
            }
            //Move to next character in word2[i]
            y++;
            if(y==word2[j].length()){
                y=0;
                j++;
            }

        }
        return i == word1.length && j == word2.length;//return if both arrays completed at  same time

    }
}