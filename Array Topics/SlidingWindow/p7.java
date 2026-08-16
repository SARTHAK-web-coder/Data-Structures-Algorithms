
public class p7 {
    // Given an array of integers arr and two integers k and threshold, return the
    // number of sub-arrays of size k and average greater than or equal to
    // threshold.

    // Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
    // Output: 3
    // Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6
    // respectively. All other sub-arrays of size 3 have averages less than 4 (the
    // threshold).
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int threshold = 4;
        int k = 3;
        System.out.println(numOfSubarrays(arr, k, threshold));

    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        // 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to
        // Threshold
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int count = 0;
        if (sum / k >= threshold) {
            count++;
        }
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum / k >= threshold) {
                count++;
            }
        }
        return count;
    }
}