class Solution {
    // public int findTheWinner(int n, int k) { //Approach -1 Tc-O(N^2) Sc - O(N)
    // ArrayList<Integer> circle = new ArrayList<>();
    // for (int i = 1; i <= n; i++) {
    // circle.add(i);
    // }
    // int curr_idx = 0;

    // while (circle.size() > 1) {
    // int next_remove = (curr_idx + k - 1) % circle.size();// k-1 adjusts to 0
    // based index and % circle.size for
    // // the index wraps around correctly in the circular
    // // structure
    // circle.remove(next_remove);
    // curr_idx = next_remove;
    // }
    // return circle.get(0);
    // }
    public int findTheWinner(int n, int k) {// Approach -2 Josephus Tc-O(N) Sc-O(1)
        // in josephus problem where the survivor is always the first person. Starting
        // from i=2 for larger group sizes
        int winner = 0;
        for (int i = 2; i <=n; i++) {
          winner = (winner + k) % i;
        }
        return winner+1;
    }

}