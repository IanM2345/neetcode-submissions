class Solution {
    public int firstMissingPositive(int[] nums) {
        int exempr = 1;

        while (true) {
            boolean flag = true;
            for (int num : nums) {
                if (num == exempr) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return exempr;
            }
            exempr++;
        }
    }
}