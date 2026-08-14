import java.util.Arrays;

public class p2o2 {
    // You are given a 0-indexed integer array nums, where nums[i] represents the
    // score of the ith student. You are also given an integer k.
    // Pick the scores of any k students from the array so that the difference
    // between the highest and the lowest of the k scores is minimized.

    // Return the minimum possible difference.

    // Example 1:
    // Input: nums = [90], k = 1
    // Output: 0
    // Example 2:

    // Input: nums = [9,4,1,7], k = 2
    // Output: 2
    public static void main(String[] args) {
        int []nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }
    public static int minimumDifference(int[] nums, int k) {
        //1984. Minimum Difference Between Highest and Lowest of K Scores
        int n = nums.length;
        if(n==1){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            min = Math.min(min , nums[i+k-1]-nums[i]);
        }
        return min;
    }
}
