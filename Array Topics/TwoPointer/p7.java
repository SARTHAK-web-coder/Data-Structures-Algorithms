package TwoPointer;

// Max dis between a pair of value(1855)
public class p7 {
    public static void main(String[] args) {
        int[] nums1 = { 55, 30, 5, 4, 2 };
        int[] nums2 = { 100, 20, 10, 10, 5 };
        System.out.println(maxDistance(nums1, nums2));
    }
    // Example 1:

    // Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
    // Output: 2
    // Explanation: The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4),
    // and (4,4).
    // The maximum distance is 2 with pair (2,4).
    // Example 2:

    // Input: nums1 = [2,2,2], nums2 = [10,10,1]
    // Output: 1
    // Explanation: The valid pairs are (0,0), (0,1), and (1,1).
    // The maximum distance is 1 with pair (0,1).

    public static int maxDistance(int[] nums1, int[] nums2) {
        if (nums1[nums1.length - 1] > nums2[0]) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                max = Math.max(max, j - i);
                j++;
            } else {
                i++;
            }
        }
        return max;
    }
}