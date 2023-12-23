import java.util.Arrays;

public class ArrayElementDeleteSpecified_LastOccur{
    // Method to delete an element at a specified location
    private static int[] deleteAtLocation(int[] array, int location) {
        int[] newArray = new int[array.length - 1]; // Create a new array with reduced size
        if (location < 0 || location >= array.length) {
            return array; // Return the original array if the location is invalid
        }
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != location) {
                newArray[newIndex] = array[i]; // Copy elements to the new array excluding the element at the specified location
                newIndex++;
            }
        }
        return newArray; // Return the updated array after deletion
    }

    // Method to delete the last occurrence of a specific element
    public static int[] deleteLastOccurrence(int[] array, int element) {
        int[] newArray;
        int location = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (element == array[i]) {
                location = i; // Store the location of the last occurrence
                break; // Stop after finding the last occurrence
            }
        }
        if (location != -1) {
            newArray = deleteAtLocation(array, location); // Delete the element at the found location
        } else {
            return array; // Return the original array if the element is not found
        }
        return newArray; // Return the updated array after deletion
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};
        System.out.println(Arrays.toString(originalArray)); // Output: 10 22 33 11 22 44 11 55 11 66 11 77 88 11 99

        originalArray = deleteLastOccurrence(originalArray, 11); // Delete the last occurrence of 11 from the array
        System.out.println(Arrays.toString(originalArray)); // Output: 10 22 33 11 22 44 11 55 11 66 11 77 88 99
    }
}

