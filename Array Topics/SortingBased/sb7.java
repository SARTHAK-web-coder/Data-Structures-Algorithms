import java.util.Arrays;

public class sb7 {
    // You are given an array nums with n objects colored red, white, or blue, sort
    // them in-place so that objects of the same color are adjacent, with the colors
    // in the order red, white, and blue.

    // We will use the integers 0, 1, and 2 to represent the color red, white, and
    // blue, respectively.

    // You must solve this problem without using the library's sort function.

    // Example 1:
    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]

    // Explanation:
    // The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s
    // first, then all 1s, then all 2s.
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        // 75. Sort Colors
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
