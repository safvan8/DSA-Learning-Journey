import java.util.Arrays;

class ArrayFirstElemInsertion {  
		public static int[] insertAtFirst(int[] array, int newElement) {
        // Create a new array with increased size to accommodate the new element
        int[] newArray = new int[array.length + 1];

        // Insert the new element at the first position
        newArray[0] = newElement;

        // Shift the existing elements to the right
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Original array
        int[] originalArray = {11, 22, 33, 44, 55};

        // Print original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(originalArray)); // Output: 11 22 33 44 55

        // Insert new element at the first position
        originalArray = insertAtFirst(originalArray, 999);

        // Print updated array
        System.out.println("Updated Array:");
        System.out.println(Arrays.toString(originalArray)); // Output: 999 11 22 33 44 55
    }
}
