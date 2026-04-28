class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length, maxWater = 0;
        int l = 0, r = n - 1 ;

        while(l < r)
        {
            int h = Math.min(heights[l], heights[r]);
            int w = r - l;

            maxWater = Math.max(maxWater, h * w);

            if(heights[l] < heights[r]) l++;
            else r--;
        }

        return maxWater;
    }
}
