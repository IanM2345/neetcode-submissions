/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int m = (left + (right - left) / 2);

            if (guess(m) == -1) {
                right = m - 1;
            } else if (guess(m) == 1) {
                left = m + 1;
            } else {
                return m;
            }
        }
        return 0;
    }
}