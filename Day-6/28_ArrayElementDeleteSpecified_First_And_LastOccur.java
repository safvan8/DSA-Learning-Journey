import java.util.Arrays;

public class ArrayElementDeleteSpecified_First_And_LastOccur{

    // Method to delete an element at a specified location
    private static int[] deleteElementAtLocation(int[] originalArray, int location) {
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

    // Method to delete the first and last occurrence of a specific element
    public static int[] deleteFirstAndLastOccurrence(int[] originalArray, int element) {
        for (int i = 0; i < originalArray.length; i++) {
            if (element == originalArray[i]) {
                originalArray = deleteElementAtLocation(originalArray, i); // Delete the first occurrence
                break; // Stop after deleting the first occurrence
            }
        }
        for (int i = originalArray.length - 1; i >= 0; i--) {
            if (element == originalArray[i]) {
                originalArray = deleteElementAtLocation(originalArray, i); // Delete the last occurrence
                break; // Stop after deleting the last occurrence
            }
        }
        return originalArray; // Return the updated array after deletion
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};

        System.out.println("Original Array: " + Arrays.toString(inputArray));

        inputArray = deleteFirstAndLastOccurrence(inputArray, 11);
        System.out.println("Array after deleting first and last occurrence of 11: " + Arrays.toString(inputArray));
    }
}

