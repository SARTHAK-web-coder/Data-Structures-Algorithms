package Sorting_Method;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2 };
        System.out.println(Arrays.toString(buble_sort(arr)));
    }

    static int[] buble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
