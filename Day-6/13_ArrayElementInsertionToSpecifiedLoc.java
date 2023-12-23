import java.util.Arrays;

class ArrayElementInsertionToSpecifiedLoc {
    public static int[] insertAtLocation(int[] originalArray, int newElement, int location) {
        // Create a new array with increased size to accommodate the new element
        int[] newArray = new int[originalArray.length + 1];
        
        // Check if the location is within the bounds of the original array
        if (location < 0 || location > originalArray.length) {
            // If the location is out of bounds, return the original array as it is
            return originalArray;
        }
        
        // Copy elements from the original array to the new array till the specified location
        for (int i = 0; i < location; i++) {
            newArray[i] = originalArray[i];
        }
        
        // Insert the new element at the specified location
        newArray[location] = newElement;
        
        // Copy the remaining elements from the original array to the new array
        for (int i = location; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }
        
        // Return the updated array
        return newArray;
    }

    public static void main(String[] args) {
        // Original array
        int[] array = {11, 22, 33, 44, 55};
        
        // Print original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array)); // Output: 11 22 33 44 55
        
				int indexLocation = 2;				
        // Insert new element at the specified location
        array = insertAtLocation(array, 999, indexLocation );

        // Print updated array
        System.out.println("Updated Array:");
        System.out.println(Arrays.toString(array)); // Output: 11 22 999 33 44 55
    }
}
