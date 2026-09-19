public class sb2 {
    // A school is trying to take an annual photo of all the students. The students
    // are asked to stand in a single file line in non-decreasing order by height.
    // Let this ordering be represented by the integer array expected where
    // expected[i] is the expected height of the ith student in line.

    // You are given an integer array heights representing the current order that
    // the students are standing in. Each heights[i] is the height of the ith
    // student in line (0-indexed).

    // Return the number of indices where heights[i] != expected[i].

    // Example 1:

    // Input: heights = [1,1,4,2,1,3]
    // Output: 3
    // Explanation:
    // heights: [1,1,4,2,1,3]
    // expected: [1,1,1,2,3,4]
    // Indices 2, 4, and 5 do not match.
    public static void main(String[] args) {
        int[] height = {1,1,4,2,1,3};
        System.out.println(heightChecker(height));
    }

    public static int heightChecker(int[] heights) {
        // 1051. Height Checker
        int n = heights.length;
        int[] arr = heights.clone(); // int[] copy = original.clone();
        for (int i = 0; i < n - 1; i++) {
            int current = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[current]) {
                    current = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[current];
            arr[current] = temp;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != arr[i]) {
                count++;
            }
        }
        return count;
    }
}
