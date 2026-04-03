//FIRST NEGATIVE NO FORM ARRAYS OF SIZE K;(PRINT)

// arr = [12, -1, -7, 8, -15, 30, 16, 28]
// k = 3
// Output
// [-1, -1, -7, -15, -15, 0]

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        int res[] = firstNegativeInWindow(arr, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] firstNegativeInWindow(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];
        int i = 0;
        while (i <= n - k) {
            int l = i;
            int r = i + k;
            boolean found = false;
            while (l < r) {
                if (arr[l] < 0) {
                    res[i] = arr[l];
                    found = true;
                    break;
                }
                l++;
            }
            if (!found) {
                res[i] = 0;
            }
            i++;
        }

        return res;
    }

}