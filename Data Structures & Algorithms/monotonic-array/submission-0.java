class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean decrease = true;
        boolean increase = true;

        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i - 1] <= nums[i])) {
                increase = false;
            }
            if(!(nums[i - 1] >= nums[i])){
                decrease = false;
            }
        }

        return increase || decrease;
    }
}