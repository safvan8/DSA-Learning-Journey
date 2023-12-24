import java.util.Arrays;

public class ArrayElement_Update_First_Second_Occurrence_of_given_Elem {

    // Method to update the first and second occurrences of a given element with a new element
    public static int[] updateFirstAndSecondOccurrence(int[] array, int oldElement, int newElement) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                count++;
                array[i] = newElement; // Replace the old element with the new element
                if (count == 2) {
                    break; // Break after updating the second occurrence
                }
            }
        }
        return array; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};
										//         0   1   2   3   4   5   6   7   8   9   10  11  12  13  14
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

      originalArray = updateFirstAndSecondOccurrence(originalArray, 11, 1000); // Update the first and second occurrences of 11 with 1000

        // Print the array after updating the first and second occurrences
        System.out.println("Updated Array: " + Arrays.toString(originalArray));
												//		[10, 22, 33, 1000, 22, 44, 1000, 55, 11, 66, 11, 77, 88, 11, 99]
    }
}

