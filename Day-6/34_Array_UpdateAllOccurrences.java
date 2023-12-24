import java.util.Arrays;

public class Array_UpdateAllOccurrences{
    // Method to update all occurrences of a given element with a new element
    public static int[] updateAllOccurrences(int[] array, int oldElement, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement; // Replace the old element with the new element
            }
        }
        return array; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        originalArray = updateAllOccurrences(originalArray, 11, 1000); // Update all occurrences of 11 with 1000

        // Print the array after updating all occurrences
        System.out.println("Updated Array: " + Arrays.toString(originalArray));
													// [10, 22, 33, 1000, 22, 44, 1000, 55, 1000, 66, 1000, 77, 88, 1000, 99]
    }
}
