class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder repeated = new StringBuilder();
        int count = 0;

        while (repeated.length() < b.length()) {
            repeated.append(a);
            count++;
        }

        if (repeated.indexOf(b) != -1) {
            return count;
        }

        repeated.append(a);
        count++;

        if (repeated.indexOf(b) != -1) {
            return count;
        }

        return -1;
    }
}
