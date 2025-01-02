class Solution { //Tc - O(m*n) Sc- O(m*n) -> O(1)
    // Directions for adjacent cells including the cell itself
    int dir[][] = {
        { -1, -1 }, { -1, 0 }, { -1, 1 },
        { 0, -1 }, { 0, 0 }, { 0, 1 },
        { 1, -1 }, { 1, 0 }, { 1, 1 }
    };
    int m, n;

    public int[][] imageSmoother(int[][] img) {
        m = img.length;          
        n = img[0].length;   

       // int[][] output = new int[m][n]; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               img[i][j] |= (imgSmoother(img, i, j)<<8);
            }
        }

          for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               img[i][j]>>=8;
            }
        }

        return img;
    }

    private int imgSmoother(int[][] img, int i, int j) {
        int sum = 0;  
        int count = 0;  

        // Traverse to all possible directions
        for (int[] d : dir) {
            int i_ = i + d[0]; // Neighbor row
            int j_ = j + d[1]; // Neighbor column

            // Check if the neighbor is within bounds
            if (i_ >= 0 && j_ >= 0 && i_ < m && j_ < n) {
                sum += img[i_][j_] &255; // Add neighbor value
                count++;
            }
        }

        // Return the average
        return sum / count;
    }
}
