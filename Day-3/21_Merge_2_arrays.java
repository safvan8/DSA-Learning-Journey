import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args) {
        // Input arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {11, 22, 33, 44, 55};

        // Merge arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Display the results
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Function to merge two arrays
    private static int[] mergeArrays(int[] array1, int[] array2) {
        // Determine the size of the merged array
        int mergedSize = array1.length + array2.length;

        // Create the merged array
        int[] mergedArray = new int[mergedSize];

        // Index variables for array traversal
        int i = 0; // Index for traversing through array1 and array2
        int k = 0; // Index for mergedArray

        // Merge arrays
        while (i < array1.length)
            mergedArray[k++] = array1[i++];

        i = 0; // Reset i for array2
        while (i < array2.length)
            mergedArray[k++] = array2[i++];

        // Return the merged array
        return mergedArray;
    }
}
