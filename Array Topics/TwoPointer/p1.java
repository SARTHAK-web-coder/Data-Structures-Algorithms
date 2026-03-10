package TwoPointer;
// input :
// numbers = [2,7,11,15]
// target = 9
// output : [1,2]
public class p1 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 13;
        int result[] = twoSum(arr, target);
        System.out.println("[" + (result[0] + 1) + "," + (result[1] + 1) + "]");
    }

    public static int[] twoSum(int arr[], int target) {
        int l = 0;
        int r = 1;
        int nums[] = new int[2];
        while (r < arr.length) {
            if (arr[l] + arr[r] == target) {
                nums[0] = l;
                nums[1] = r;
                break;
            } else if (arr[l] + arr[r] < target) {
                r++;
            } else {
                l++;
            }
        }
        return nums;
    }
}
