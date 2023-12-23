import java.util.Arrays;

class ArrayLastElemInsertion {
    public static int[] insertAtLast(int[] originalArray, int newElement) {
        // Create a new array with increased size to accommodate the new element
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new element at the last position
        newArray[originalArray.length] = newElement;
        return newArray;
    }

    public static void main(String[] args) {
        // Original array
        int[] array = {11, 22, 33, 44, 55};

        // Print original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array)); // Output: 11 22 33 44 55

        // Insert new element at the last position
        array = insertAtLast(array, 999);

        // Print updated array
        System.out.println("Updated Array:");
        System.out.println(Arrays.toString(array)); // Output: 11 22 33 44 55 999
    }
}

