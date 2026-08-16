package Sorting_Method;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
                j--;
            }
            // Sorting until ith index
        }
        System.out.println(Arrays.toString(arr));
    }
}
