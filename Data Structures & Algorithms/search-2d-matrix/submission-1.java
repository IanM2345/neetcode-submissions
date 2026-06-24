class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bot = row - 1;

        while (top <= bot) {
            int rows = (top + bot) / 2;
            if (target > matrix[rows][col - 1]) {
                top = rows + 1;
            } else if (target < matrix[rows][0]) {
                bot = rows - 1;
            } else {
                break;
            }
        }

        if (!(top <= bot)) {
            return false;
        }
        int rows = (top + bot) / 2;
        int left = 0;
        int right = col - 1;
        while (left <= right) {
            int m = (left + right) / 2;
            if (target > matrix[rows][m]) {
                left = m + 1;
            } else if (target < matrix[rows][m]) {
                right = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
