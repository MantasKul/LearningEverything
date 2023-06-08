// Binary Search algorithm learning
// Binary Search requires sorted array
// Takes array and value to find
// Returns index of array where the value is if the value was found
// Returns -1 if value does not exist in the array
package algorithms;

public class BinarySearch {
    public int find(int array[], int valueToFind) {
        int leftIndex = 0;
        int rightIndex = array.length-1;
        int middle;

        while(leftIndex <= rightIndex) {
            middle = (int) Math.floor((leftIndex + rightIndex) / 2);
            if(array[middle] < valueToFind) leftIndex = middle+1;
            else if (array[middle] > valueToFind) rightIndex = middle-1;
            else return middle;
        }

        return -1;
    }
}
