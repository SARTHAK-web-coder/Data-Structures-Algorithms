public class p3o3 {
    // The k-beauty of an integer num is defined as the number of substrings of num
    // when it is read as a string that meet the following conditions:

    // It has a length of k.
    // It is a divisor of num.
    // Given integers num and k, return the k-beauty of num.

    // Note:

    // Leading zeros are allowed.
    // 0 is not a divisor of any value.
    // A substring is a contiguous sequence of characters in a string.
    // Input: num = 430043, k = 2
    // Output: 2
    // Explanation: The following are the substrings of num of length k:
    // - "43" from "430043": 43 is a divisor of 430043.
    // - "30" from "430043": 30 is not a divisor of 430043.
    // - "00" from "430043": 0 is not a divisor of 430043.
    // - "04" from "430043": 4 is not a divisor of 430043.
    // - "43" from "430043": 43 is a divisor of 430043.
    // Therefore, the k-beauty is 2.
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        System.out.println(divisorSubstrings(num, k));
    }

    public static int divisorSubstrings(int num, int k) {
        // 2269. Find the K-Beauty of a Number
        String s = Integer.toString(num);
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n - k + 1; i++) {
            String val = s.substring(i, i + k);
            int res = Integer.parseInt(val);
            if (res != 0 && num % res == 0) {
                count++;
            }
        }
        return count;
    }

}
