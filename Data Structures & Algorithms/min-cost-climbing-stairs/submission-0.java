class Solution {
    private int[] stairs;
    public int minCostClimbingStairs(int[] cost) {
        stairs = new int[cost.length];
        Arrays.fill(stairs, -1);
        return Math.min(climb(cost, 0), climb(cost, 1));
    }

    public int climb(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }
        if (stairs[i] != -1) {
            return stairs[i];
        }
        stairs[i] = cost[i] + Math.min(climb(cost, i + 1), climb(cost, i + 2));
        return stairs[i];
    }
}
