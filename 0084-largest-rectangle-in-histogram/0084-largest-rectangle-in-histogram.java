class Solution {
    public static int largestRectangleArea(int[] heights) {//O(N)+O(N)  O(N)
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int nsl[] = new int[heights.length];//next smaller to left
        int nsr[] = new int[heights.length];//next smaller to right
        
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            
            s.push(i);
        }
        
        s.clear(); 
        
        for (int i = heights.length - 1; i >= 0; i--) {  
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            
            s.push(i);
        }
        
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;//width = (nsr[i] - 1) - (nsl[i] + 1) + 1 = nsr[i] - nsl[i] - 1  e.g,((R-L)+1)

            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        
        return maxArea;
    }
}
