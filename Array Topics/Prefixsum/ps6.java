import java.util.HashMap;

public class ps6 {

    // Given a binary array nums, return the maximum length of a contiguous subarray
    // with an equal number of 0 and 1.

    // Example 1:

    // Input: nums = [0,1]
    // Output: 2
    // Explanation: [0, 1] is the longest contiguous subarray with an equal number
    // of 0 and 1.
    // Example 2:

    // Input: nums = [0,1,0]
    // Output: 2
    // Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal
    // number of 0 and 1.
    // Example 3:

    // Input: nums = [0,1,1,1,1,1,0,0,0]
    // Output: 6
    // Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal
    // number of 0 and 1.
    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 0, 0, 1, 0, 1 };// output : 8
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        // 525. Contiguous Array
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int max = 0;
        map.put(0, -1);
        int preSum = 0;
        for (int i = 0; i < n; i++) {
            preSum = preSum + nums[i];
            if (map.containsKey(preSum)) {
                int length = i - map.get(preSum);// map.get(preSum) previous index sum is equal or contains to get
                                                 // length
                max = Math.max(max, length);
            } else {
                map.put(preSum, i);
            }

        }
        return max;
    }
}