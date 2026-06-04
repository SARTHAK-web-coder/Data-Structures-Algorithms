public class b3 {
    // 374. Guess Number Higher or Lower
    // We are playing the Guess Game. The game is as follows:

    // I pick a number from 1 to n. You have to guess which number I picked (the
    // number I picked stays the same throughout the game).
    // Every time you guess wrong, I will tell you whether the number I picked is
    // higher or lower than your guess.

    // You call a pre-defined API int guess(int num), which returns three possible
    // results:

    // Example
    // Input: n = 10, pick = 6
    // Output: 6
    // Example 2:

    public static void main(String[] args) {
        // System.out.println(guessNumber(n));
    }

    // public class Solution extends GuessGame {
    // public static int guessNumber(int n) {
    // int l = 1;
    // int h = n;
    // while (l <= h) {
    // int mid = l + (h - l) / 2;
    // int res = guess(mid);
    // if (res == 0) {
    // return mid;
    // } else if (res == 1) {
    // l = mid + 1;
    // } else {
    // h = mid - 1;
    // }
    // }
    // return -1;

    // }
    // }
}
/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */
