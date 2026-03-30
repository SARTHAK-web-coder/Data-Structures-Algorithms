// Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]
// Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
package TwoPointer;

public class p6 {
    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int l = 2;
        int r = 2;
        while (r < nums.length) {
            if (nums[r] != nums[l - 2]) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}