import java.util.Arrays;

public class ArrayAllElementDeletion {
    public static int[] deleteAll(int[] inputArray) {
        // Create a new empty array
        int[] newArray = new int[0];
        return newArray; // Return the new empty array
    }

    public static void main(String[] args) {
        int[] originalArray = {11, 22, 33, 44, 55}; // Original array
        System.out.println(Arrays.toString(originalArray)); // Output: 11 22 33 44 55
        
				originalArray = deleteAll(originalArray); // Delete all elements from the array
        System.out.println(Arrays.toString(originalArray)); // Output: 
    }
}
