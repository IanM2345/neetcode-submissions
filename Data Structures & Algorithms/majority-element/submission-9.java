class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;

        for (int num : nums) {
            for (int i : nums) {
                if (num == i) {
                    k++;
                }
            }

            if (k > nums.length / 2) {
                return num;
            }
        }

        return 0;
    }
}