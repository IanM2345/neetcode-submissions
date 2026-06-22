class Solution {
    public int[] sortArray(int[] nums) {
        int [] arr = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            arr[i] = nums[i];
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}