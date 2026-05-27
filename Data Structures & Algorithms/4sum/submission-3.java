class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j;
            for (j = i + 1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                long sum;
                while (left < right) {
                    sum = (long)nums[left] + nums[right] + nums[i] + nums[j];
                    if (sum < (long)(target)) {
                        left++;
                    } else if (sum > (long)(target)) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[left], nums[right], nums[i], nums[j]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }
        return result;
    }
}