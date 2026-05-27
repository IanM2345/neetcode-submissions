class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if (nums[i] == nums[j]){
                    result = true;
                }
            }
        }
        return result;
    }
}