class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> s= new Stack<>();

        for(int i=0; i<=n; i++)
        {
            int h = (i==n) ? 0 : heights[i];

            while(!s.isEmpty() && h < heights[s.peek()])
            {
                int height = heights[s.pop()];
                int width = s.isEmpty() ? i : (i-s.peek()-1);
                maxArea = Math.max(maxArea, (height*width));
            }
            s.push(i);
        }

        return maxArea;
    }
}
