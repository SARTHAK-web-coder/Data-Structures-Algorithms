// 6. Container With Most Water
// Difficulty: Medium
// Problem Statement:
// Given n vertical lines where each represents height, find two lines that together with the x-axis form a container that holds the most water.

// Sample Input
// height = [1,8,6,2,5,4,8,3,7]
// Sample Output
// 49
package TwoPointer;

public class p5 {
    public static void main(String[] args) {
        int[] h = { 1, 1 };
        System.out.println(waterContain(h));
    }

    public static int waterContain(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int max = 0;
        while (l < r) {
            int min = Math.min(h[l], h[r]);
            int val = min * (r - l);
            max = Math.max(max, val);
            if (h[r] >= h[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}