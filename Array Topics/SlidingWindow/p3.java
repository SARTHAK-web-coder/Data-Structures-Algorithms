//Minimum Recolors to Get K Consecutive Black Blocks
// Input: blocks = "WBBWWBBWBW", k = 7
// Output: 3
// Explanation:
// One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
// so that blocks = "BBBBBBBWBW". 
// It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
// Therefore, we return 3.
public class p3 {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW`";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }

    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int c = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                c++;
            }
        }
        int min = c;
        int l = 0;
        int r = k - 1;
        while (r < n - 1) {
            if (blocks.charAt(l) == 'W') {
                c--;
            }
            l++;
            r++;
            if (blocks.charAt(r) == 'W') {
                c++;
            }
            min = Math.min(min, c);
        }
        return min;
    }
}
