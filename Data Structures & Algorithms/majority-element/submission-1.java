class Solution {
    public int majorityElement(int[] nums) {
        
        for(int num: nums){ 

            int frequency=0;

            for(int i : nums){

                if(i==num){

                    frequency++;

                }
            }

            if ( frequency> nums.length/2){

                return num;
                
            }
        }

        return -1;
    }
}