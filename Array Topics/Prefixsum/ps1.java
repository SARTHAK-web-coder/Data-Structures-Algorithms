import java.util.Arrays;

public class ps1 {
    // Given an array nums. We define a running sum of an array as runningSum[i] =
    // sum(nums[0]…nums[i]).

    // Return the running sum of nums.

    // Example 1:

    // Input: nums = [1,2,3,4]
    // Output: [1,3,6,10]
    // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    // Example 2:

    // Input: nums = [1,1,1,1,1]
    // Output: [1,2,3,4,5]
    // Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
    // 1+1+1+1+1].
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int arr[] = runningSum(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] runningSum(int[] nums) {
        // 1480. Running Sum of 1d Array
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }
}
