class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                leftMax = Math.max(height[left], leftMax);
                sum += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(height[right], rightMax);
                sum += rightMax - height[right];
            }
        }
        return sum;
    }
}
