class Solution {
    private int[] arr;
    public int climbStairs(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }
        return steps(n, 0);
    }
    public int steps(int n, int i) {
        if (i >= n) {
            return i == n ? 1 : 0;
        }
        if (arr[i] != -1) {
            return arr[i];
        }
        return arr[i] = steps(n, i + 1) + steps(n, i + 2);
    }
}
