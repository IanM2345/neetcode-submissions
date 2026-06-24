class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 1;
        while (true) {
            if (!map.containsKey(count)) {
                return count;
            }
            count++;
        }
    }
}