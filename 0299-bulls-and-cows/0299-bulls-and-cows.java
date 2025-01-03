class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int numbers[] = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char A = secret.charAt(i);
            char B = guess.charAt(i);

            if (A == B) {// count digits in correct pos
                bulls++;
            } else {// unmatched digits
                if (numbers[A - '0'] < 0) {
                    cows++;
                }
                if (numbers[B - '0'] > 0) {
                    cows++;
                }
                numbers[A - '0']++;
                numbers[B - '0']--;

            }

        }
        return bulls + "A" + cows + "B";

    }
}