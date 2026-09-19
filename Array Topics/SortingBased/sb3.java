import java.util.Arrays;
import java.util.HashSet;

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
public class sb3 {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // 349. Intersection of Two Arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet <Integer> set = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        int l=0;
        int r=0;
        while(l<n && r<m){
            if(nums1[l]>nums2[r]){
                r++;
            }else if(nums1[l]<nums2[r]){
                l++;
            }
            else{
                set.add(nums1[l]);
                l++;
                r++;
            }
        }
        int arr[]=new int[set.size()];
        int i=0;
        for(int val : set){
            arr[i++]=val;
        }
        return arr;

    }

}
