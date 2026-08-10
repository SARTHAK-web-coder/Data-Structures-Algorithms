public class b8 {
    // There is an integer array nums sorted in non-decreasing order (not
    // necessarily with distinct values).

    // Before being passed to your function, nums is rotated at an unknown pivot
    // index k (0 <= k < nums.length) such that the resulting array is [nums[k],
    // nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
    // example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become
    // [4,5,6,6,7,0,1,2,4,4].

    // Given the array nums after the rotation and an integer target, return true if
    // target is in nums, or false if it is not in nums.

    // You must decrease the overall operation steps as much as possible.

    // Example 1:

    // Input: nums = [2,5,6,0,0,1,2], target = 1
    // Output: true
    // Example 2:

    // Input: nums = [2,5,6,0,0,1,2], target = 3
    // Output: false

    public static void main(String[] args) {
        // 81. Search in Rotated Sorted Array II
        int nums[] = { 1, 0, 1, 1, 1 }; // 2,5,6,0,0,1,2 and target = 1;
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }

            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
