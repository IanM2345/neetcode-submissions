class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        int maxArea= 0;

        while (l < r) {
            int height = Math.min(heights[r], heights[l]);
            int width = r - l;
            
            area = height * width;
            maxArea= Math.max(maxArea,area);
            if (heights[r] > heights[l]) {
                l++;
            } else if(heights[r] == heights[l]){
                l++;
                r--;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
