class Solution {
    public int[] sortArray(int[] nums) {
        int [] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            result[i]=nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(result[i]>result[j]){
                    int temp= result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}