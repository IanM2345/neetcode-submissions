class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = 0;
        while (left <= right) {
            int n = left + ((right - left) / 2);
            if ((long) n * n > x) {
                right = n - 1;
            } else if ((long) n * n < x) {
                left = n + 1;
                res = n;
            } else {
                return n;
            }
        }
        return res;
    }
}