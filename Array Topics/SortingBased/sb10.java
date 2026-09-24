import java.util.Arrays;

public class sb10 {
    // Given a list of non-negative integers nums, arrange them such that they form
    // the largest number and return it.

    // Since the result may be very large, so you need to return a string instead of
    // an integer.

    // Example 1:

    // Input: nums = [10,2]
    // Output: "210"
    // Example 2:

    // Input: nums = [3,30,34,5,9]
    // Output: "9534330"
    public static void main(String[] args) {
        int nums[] = { 3, 30, 34, 5, 9 };
        String ans = largestNumber(nums);
        System.out.println(ans);
    }

    public static String largestNumber(int[] nums) {
        // 179. Largest Number
        int n = nums.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        // gives [3,30,34,5,9] to ["3","30","34","5","9"]

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        // this gives ["3","30","34","5","9"] to ["9", "5", "34", "3", "30"]

        if (str[0].equals("0")) {
            return "0";
        }

        // Now simply joining them:
        // 9 + 5 + 34 + 3 + 30
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str[i]);
        }
        // StringBuilder to nomal string : "9534330"
        String ans = sb.toString();

        return ans;

    }

}