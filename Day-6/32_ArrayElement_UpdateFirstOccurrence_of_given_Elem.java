import java.util.Arrays;

public class ArrayElement_UpdateFirstOccurrence_of_given_Elem {

    // Method to update the first occurrence of a given element in the array
    public static int[] updateFirstOccurrence(int[] array, int oldElement, int newElement) {
        // Linear search to find the first occurrence of the old element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement; // Replace the old element with the new element
                break; // Exit the loop after updating the first occurrence
            }
        }
        return array; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        originalArray = updateFirstOccurrence(originalArray, 11, 1000); // Update the first occurrence of 11 with 1000

        // Print the array after updating the first occurrence
        System.out.println("Updated Array: " + Arrays.toString(originalArray));
												// [10, 22, 33, 1000, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99]
    }
}

