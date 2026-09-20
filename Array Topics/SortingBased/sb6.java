import java.util.Arrays;

public class sb6 {
    // Given an integer array nums sorted in non-decreasing order, return an array
    // of the squares of each number sorted in non-decreasing order.

    // Example 1:

    // Input: nums = [-4,-1,0,3,10]
    // Output: [0,1,9,16,100]
    // Explanation: After squaring, the array becomes [16,1,0,9,100].
    // After sorting, it becomes [0,1,9,16,100].
    // Example 2:

    // Input: nums = [-7,-3,2,3,11]
    // Output: [4,9,9,49,121]
    public static void main(String[] args) {
        int nums[] = {7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        // 977. Squares of a Sorted Array
        int n = nums.length;
        int arr[] = new int[n];
        int left = 0;
        int right = n - 1;
        int idx = n - 1;
        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if (rightsq >= leftsq) {
                arr[idx--] = rightsq;
                right--;
            } else {
                arr[idx--] = leftsq;
                left++;
            }
        }
        return arr;
    }
}