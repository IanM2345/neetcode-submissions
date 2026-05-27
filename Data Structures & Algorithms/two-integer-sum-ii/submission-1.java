class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);

        for(int i=0; i<numbers.length; i++){
            int sum;
            for(int j=i+1; j<numbers.length; j++){
                sum= numbers[i]+numbers[j];
                if (sum == target){
                    return new int[]{i+1,j+1};
                }
            }
        }

        return null;
    }
}
