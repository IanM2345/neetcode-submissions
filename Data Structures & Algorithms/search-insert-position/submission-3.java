class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;

        while (left <= right) {
            int n = (right + left) / 2;

            if (nums[n] == target) {
                return n;
            }

            if (nums[n] > target) {
                res = n;
                right = n - 1;
            } else {
                left = n + 1;
            }
        }
        return res;
    }
}