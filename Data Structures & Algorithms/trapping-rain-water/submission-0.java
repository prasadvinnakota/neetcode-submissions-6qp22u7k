class Solution {
    public int trap(int[] height) {

        int left[] = new int[height.length];
        int right[] =  new int[height.length];
        int maxSum =  0;

        left[0] = height[0];
        right[height.length-1] = height[height.length-1];

        for(int i=1;  i<=height.length-1; i++)
        {
            left[i] = Math.max(left[i-1], height[i]);
        }

        for(int j=height.length-2; j>=0; j--)
        {
            right[j] = Math.max(right[j+1], height[j]);
        }

        for(int i=1; i<=height.length-2; i++)
        {
            maxSum = maxSum + (Math.min(left[i], right[i]) - height[i]);
        }

        return maxSum;
        
    }
}
