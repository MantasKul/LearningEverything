package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int x = 8;
        binarySearch(arr, x);
    }

    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        return -1;
    }

    // Return index of the value x in arr, -1 if value doesn't exist
    public static int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;

        while ( left <= right) {
            int middle = left + (right-left) / 2;

            if(arr[middle] == x) return middle;

            if(arr[middle] < x) left = middle + 1;
            else right = middle - 1;
        }

        return -1;
    }
}