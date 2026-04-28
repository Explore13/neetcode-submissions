class Solution {
    public int maxArea(int[] height) {

        int maxWater = 0;
        for(int i = 0; i < height.length; i++)
        {
            for(int j = i  + 1; j < height.length; j++)
            {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                maxWater = Math.max(maxWater, h * w);
            }
        }

        return maxWater;
        
    }
}