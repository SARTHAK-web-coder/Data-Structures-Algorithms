package TwoPointer;
// Sample Input : nums = [0,1,0,3,12]

// Sample Output : nums = [1,3,12,0,0]

import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        int k = moveZero(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }

    public static int moveZero(int nums[]) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        return r;
    }
}
