public class p5 {
    //209. Minimum Size Subarray Sum
    // Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a subarray whose sum is greater than or equal to
    // target. If there is no such subarray, return 0 instead.

    // Example 1:

    // Input: target = 7, nums = [2,3,1,2,4,3]
    // Output: 2
    // Explanation: The subarray [4,3] has the minimal length under the problem
    // constraint.
    public static void main(String[] args) {
        int target = 11;
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (r < n) {
            sum = sum + nums[r];
            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;
        }
    }

}