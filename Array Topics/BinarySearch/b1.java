public class b1 {
    public static void main(String[] args) {
        int nums[] = { 1,3,5,6 };
        int target = 2;
        int x = searchInsert(nums, target);
        System.out.println(x);
    }
    // Example 1:
    // Input: nums = [1,3,5,6], target = 5
    // Output: 2 (index no. have to put)

    // Example 2:
    // Input: nums = [1,3,5,6], target = 2
    // Output: 1
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r + 1;
    }

}
