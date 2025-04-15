class Solution {
    // public int uniquePaths(int m, int n) {//brute force time - O(2^(m+n))  space- O(m + n)
    //     return countPaths(0, 0, m, n);
    // }

    // private int countPaths(int i, int j, int m, int n) {
    //     // If i and j reached bottom-right corner
    //     if (i == m - 1 && j == n - 1) return 1;

    //     //if out of bounds return 0
    //     if (i >= m || j >= n) return 0;

        
    //     return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
    // }
    public int uniquePaths(int m, int n) {//Better Approach time - O(M*N)  space - O(M*N)
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return countPaths(0, 0, m, n, dp);
    }

    private int countPaths(int i, int j, int m, int n, int[][] dp) {
        // Base case: reached bottom-right corner
        if (i == m - 1 && j == n - 1) return 1;

        // Out of bounds
        if (i >= m || j >= n) return 0;

        // If already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Recursively compute and store
        dp[i][j] = countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);
        return dp[i][j];
    }
}
