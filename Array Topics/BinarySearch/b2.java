public class b2 {
    // 367. Valid Perfect Square

    // Given a positive integer num, return true if num is a perfect square or false
    // otherwise.
    // You must not use any built-in library function, such as sqrt.
    // Example

    // Input: num = 16
    // Output: true
    // Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long s = (long) mid * mid;
            if (s == num) {
                return true;
            } else if (s > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return false;
    }
}
