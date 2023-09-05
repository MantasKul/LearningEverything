package org.example;

public class Main {
    public static void main(String[] args) {

        int n = 48823;
        while(n > 0) {
            System.out.println(n);
            n = n / 10;
        }
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


    public static long[] gapInPrimes(int gap, long m, long n) {
        long[] primePair = {0, 0};

        for(long i = m; i <= n; i++) {
            if(isPrime(i)) {
                primePair[0] = primePair[1];
                primePair[1] = i;

                if(primePair[1] - primePair[0] == gap) return primePair;
            }
        }

        return null;
    }
    // Checks if number is prime
    public static boolean isPrime(long number) {

        if(number <= 1) return false;

        for(long i=2; i <= number/2; i++) {
            if((number%i) == 0) return false;
        }

        return true;
    }
}