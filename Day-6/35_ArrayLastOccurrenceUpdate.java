import java.util.Arrays;

public class ArrayLastOccurrenceUpdate {
    // Method to update the last occurrence of a given element in the array
    public static int[] updateLastOccurrence(int[] array, int oldElement, int newElement) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == oldElement) {
                array[i] = newElement; // Replace the last occurrence of the old element with the new element
                break; // Exit the loop after updating the last occurrence
            }
        }
        return array; // Return the updated array
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Update the last occurrence of 11 with 1000
        originalArray = updateLastOccurrence(originalArray, 11, 1000);

        // Display the updated array
        System.out.println("Updated Array: " + Arrays.toString(originalArray));
													//  [10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 1000, 99]
    }
}
