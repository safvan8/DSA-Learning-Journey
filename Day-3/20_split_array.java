import java.util.Arrays;
import java.util.Scanner;

public class ArraySplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array elements
        int[] originalArray = {1,2,3,4,5, 6,7,8,9,10};
        int arraySize = originalArray.length;
        
        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

				int splitLocation =4;

        // Create two arrays to store the split parts
        int[] firstPart = new int[splitLocation];
        int[] secondPart = new int[arraySize - splitLocation];

                // Split the array into two parts

                // Copy elements from the original array to the first part
                for (int i = 0; i < splitLocation; i++) {
                    firstPart[i] = originalArray[i];
                }
                
                // Copy elements from the original array to the second part
                // Starting from the split location and adjusting the index for the second part
                for (int i = splitLocation; i < arraySize; i++) {
                    // We subtract the splitLocation to ensure the second part starts from index 0
                    // in its own array, providing a clean separation of the two parts.
                    System.out.println("(i - splitLocation) value is: "+ (i - splitLocation));
                    secondPart[i - splitLocation] = originalArray[i];
                }
                
        // Display the results
        System.out.println("\n\nOriginal Array: " + Arrays.toString(originalArray));
        System.out.println("First Part: " + Arrays.toString(firstPart));
        System.out.println("Second Part: " + Arrays.toString(secondPart));
    }
}
