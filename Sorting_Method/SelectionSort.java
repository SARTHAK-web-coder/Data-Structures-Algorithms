package Sorting_Method;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 4, 2 };
        System.out.println(Arrays.toString(selection_sort(arr)));
    }

    static int[] selection_sort(int[] arr) {
        int n = arr.length;
         for(int i=0;i<n-1;i++){
            int k =i;
            for(int j= i+1;j<n;j++){
                if(arr[k] > arr[j]){
                    k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
         }
        return arr;
    }
}
