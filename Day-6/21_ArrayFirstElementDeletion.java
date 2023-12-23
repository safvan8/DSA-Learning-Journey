import java.util.Arrays;

public class ArrayFirstElementDeletion {
    
public static int[] deleteFirstElement(int[] inputArray) {
        // Create a new array with one less element than the input array
        int[] newArray = new int[inputArray.length - 1];

        // Copy elements from the input array to the new array, starting from the second element
        for (int i = 0; i < inputArray.length - 1; i++) {
            newArray[i] = inputArray[i + 1];
        }

        return newArray; // Return the updated array
    }

    public static void main(String[] args) {
        int[] originalArray = {11, 22, 33, 44, 55}; // Original array
        System.out.println(Arrays.toString(originalArray)); // Output: 11 22 33 44 55

        originalArray = deleteFirstElement(originalArray); // Delete the first element of the array
        System.out.println(Arrays.toString(originalArray)); // Output: 22 33 44 55
    }
}
