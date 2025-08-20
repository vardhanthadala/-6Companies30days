class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n - k + 1];//n-k+1 --> total number of windows
        int ri = 0;//result index

        Deque<Integer> dq = new ArrayDeque<>();//stores indices

        for (int i = 0; i < n; i++) {
            //1.remove indices  out of range k
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }
            // 2.remove smaller numbers in k range as they are useless
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            // 3. Add current index
            dq.offer(i);

            if (i >= k - 1) { //first window starts at k-1 (0 based index)
                r[ri] = nums[dq.peek()];
                ri = ri + 1;
            }
        }
        return r;

    }
}