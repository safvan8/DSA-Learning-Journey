import java.util.Arrays;

public class ArrayLastElementDeletion {

    public static int[] deleteLastElement(int[] inputArray) {
        // Create a new array with one less element than the input array
        int[] newArray = new int[inputArray.length - 1];
        
        // Copy elements from the input array to the new array, excluding the last element
        for (int i = 0; i < inputArray.length - 1; i++) {
            newArray[i] = inputArray[i];
        }
        
        return newArray; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {11, 22, 33, 44, 55}; // Original array
        System.out.println(Arrays.toString(originalArray)); // Output: 11 22 33 44 55
        
        originalArray = deleteLastElement(originalArray); // Delete the last element of the array
        System.out.println(Arrays.toString(originalArray)); // Output: 11 22 33 44
    }
}
