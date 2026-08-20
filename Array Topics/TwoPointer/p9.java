import java.util.Arrays;

public class p9 {
    // Given a 1-indexed array of integers numbers that is already sorted in
    // non-decreasing order, find two numbers such that they add up to a specific
    // target number. Let these two numbers be numbers[index1] and numbers[index2]
    // where 1 <= index1 < index2 <= numbers.length.

    // Return the indices of the two numbers index1 and index2, each incremented by
    // one, as an integer array [index1, index2] of length 2.

    // The tests are generated such that there is exactly one solution. You may not
    // use the same element twice.

    // Your solution must use only constant extra space.

    // Example 1:

    // Input: numbers = [2,7,11,15], target = 9
    // Output: [1,2]
    // Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We
    // return [1, 2].
    // Example 2:

    // Input: numbers = [2,3,4], target = 6
    // Output: [1,3]
    // Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We
    // return [1, 3].
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        // 167. Two Sum II - Input Array Is Sorted
        int arr[] = { -1, -1 };
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return arr;
    }
}
