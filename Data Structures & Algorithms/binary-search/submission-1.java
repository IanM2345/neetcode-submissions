class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int n = left + ((right - left) / 2);
            if(nums[n]>target){
                right = n-1;
            }else if(nums[n]<target){
                left = n+1;
            }else{
                return n;
            }
        }

        return -1;
    }
}
