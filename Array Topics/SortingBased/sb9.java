public class sb9 {
    // Given an integer freqay nums and an integer k, return the kth largest element
    // in the freqay.

    // Note that it is the kth largest element in the sorted order, not the kth
    // distinct element.

    // Can you solve it without sorting?

    // Example 1:

    // Input: nums = [3,2,1,5,6,4], k = 2
    // Output: 5
    // Example 2:

    // Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    // Output: 4
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        // 215. Kth Largest Element in an freqay
        int freq[] = new int[20001];
        for (int val : nums) {
            freq[val + 10000]++;
        }
        int ans = 0;
        for (int i = 20000; i >= 0; i--) {
            while (freq[i] == 0) {
                i--;
            }
            k = k - freq[i];
            if (k <= 0) {
                ans = i - 10000;
                break;
            }
        }
        return ans;
    }
}
