import java.util.Arrays;

public class ArrayElementDeleteSpecifiedFirstAndSecondOccur {

    // Method to delete an element at a specified location
    private static int[] deleteAtLocation(int[] array, int location) {
        // Create a new array to store elements after deletion
        int[] newArray = new int[array.length - 1];

        // Check if the specified location is within the array's bounds
        if (location < 0 || location >= array.length) {
            return array; // Return the original array if the location is invalid
        }

        // Copy elements from the original array to the new array, excluding the element at the specified location
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != location) 
                newArray[j++] = array[i];
						else //optional
								continue; 
        }

        return newArray; // Return the updated array after deletion
    }

    // Method to delete the first and second occurrence of a specific element
    public static int[] deleteFirstAndSecondOccurrence(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                count++; // Increase the count of occurrences
                array = deleteAtLocation(array, i); // Delete the element at the current location
                if (count == 2) {
                    break; // Stop after deleting the second occurrence
                }
            }
        }
        return array; // Return the updated array after deletion
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};
        System.out.println(Arrays.toString(originalArray)); // Output: 10 22 33 11 22 44 11 55 11 66 11 77 88 11 99

        // Delete the first and second occurrence of 11 from the array
        originalArray = deleteFirstAndSecondOccurrence(originalArray, 11);
        System.out.println(Arrays.toString(originalArray)); // Output: 10 22 33 22 44 55 11 66 11 77 88 11 99
    }
}

