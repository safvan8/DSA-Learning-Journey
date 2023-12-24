import java.util.Arrays;

public class ArrayElementUpdateBasedOnLocation {


    // Method to update an element at a specified location in the array
    public static int[] updateElementAtLocation(int[] array, int location, int newElement) {
        // Check if the location is within the bounds of the array
        if (location >= 0 && location < array.length) {
            array[location] = newElement; // Update the element at the specified location
        }
        return array; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99};
										//         0   1   2   3   4   5   6   7   8   9   10  11  12  13  14
				int location =7;
				int newElement=1000;
        originalArray = updateElementAtLocation(originalArray, location , newElement); // Update the element at index 7 with value 1000

        // Print the array after updating the element
        System.out.println("Updated Array: " + Arrays.toString(originalArray)); 
														// [10, 22, 33, 11, 22, 44, 11, 1000, 11, 66, 11, 77, 88, 11, 99]
    }
}

