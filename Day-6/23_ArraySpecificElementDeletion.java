import java.util.Arrays;

public class ArraySpecificElementDeletion {
    public static int[] deleteAtLocation(int[] inputArray, int location) {
        // Create a new array with one less element than the input array
        int[] newArray = new int[inputArray.length - 1];

        // Check if the specified location is valid
        if (location < 0 || location >= inputArray.length) {
            return inputArray; // Return the original array if the location is invalid
        }

        // Copy elements from the input array to the new array, excluding the element at the specified location
				// both i and j variables are initialized with zero.
        for (int i = 0, j = 0; i < inputArray.length; i++) {
            if (i != location) 
                newArray[j++] = inputArray[i];
            else // optional 
								continue; 
        }

        return newArray; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {11, 22, 33, 44, 55}; // Original array

