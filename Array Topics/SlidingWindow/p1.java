// Count the number of subarrays of size K whose sum > X.

// Sample Input
// arr = [1,4,2,10,23,3,1,0,20]
// k = 4
// x = 20
// Output
// 5
public class p1 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        int x = 20;
        System.out.println(countSubarrays(arr, k, x));
    }

    public static int countSubarrays(int[] arr, int k, int x) {
        int n = arr.length;
        int count = 0;
        int wd = 0;
        for (int i = 0; i < k; i++) {
            wd = wd + arr[i];
        }
        if (wd > x) {
            count = 1;
        }
        for (int i = k; i < n; i++) {
            wd = wd + arr[i];
            wd = wd - arr[i - k];
            if (wd > x) {
                count++;
            }
        }
        return count;

    }
}
