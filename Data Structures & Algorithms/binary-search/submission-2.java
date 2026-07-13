class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int n = left + ((right - left) / 2);
            if (nums[n] > target) {
                right--;
            } else if (nums[n] < target) {
                left++;
            } else {
                return n;
            }
        }
        return -1;
    }
}
