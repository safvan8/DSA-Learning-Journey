import java.util.Arrays;

public class ArrayElementDeleteSpecified_All_Occur{
    // Method to delete an element at a specified location
    public static int[] deleteElementAtLocation(int[] originalArray, int location) {
        int[] newArray = new int[originalArray.length - 1];

        if (location < 0 || location >= originalArray.length) {
            return originalArray; // If the location is invalid, return the original array
        }

        int newIndex = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (i != location) {
                newArray[newIndex] = originalArray[i]; // Copy elements to the new array excluding the element at the specified location
                newIndex++;
            }
        }
        return newArray; // Return the updated array after deletion
    }

    // Method to delete all occurrences of a specific element
    public static int[] deleteAllOccurrences(int[] originalArray, int element) {
        for (int i = 0; i < originalArray.length; i++) {
            if (element == originalArray[i]) {
                originalArray = deleteElementAtLocation(originalArray, i); // Delete the occurrence of the specified element
                i--; // Update the index to account for the modified array
            }
        }
        return originalArray; // Return the updated array after deletion of all occurrences
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};

        System.out.println("Original Array: " + Arrays.toString(inputArray));

        inputArray = deleteAllOccurrences(inputArray, 11);
        System.out.println("Array after deleting all occurrences of 11: " + Arrays.toString(inputArray));
    }
}
