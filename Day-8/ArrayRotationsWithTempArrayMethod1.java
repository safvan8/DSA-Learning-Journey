import java.util.Arrays;

public class ArrayRotationsWithTempArrayMethod1 {
    // Method to rotate the array to the left using a temporary array (Method 1)
    public static int[] rotateLeft(int[] array, int rotations) {
        rotations = rotations % array.length; 

        int n = array.length;  
        int[] temp = new int[rotations];  // Create a temporary array to store elements to be moved

        // Store the first 'rotations' elements in the temporary array
        for (int i = 0; i < rotations; i++) {
            temp[i] = array[i];
        }

        // Shift the remaining elements to the left
        for (int i = rotations; i < n; i++) {
						System.out.println("array"+"["+i+" - "+rotations+"] = "+"array[" + i+ "]");
            array[i - rotations] = array[i];
        }

        // Place the elements from the temporary array at the end of the array
        for (int i = 0; i < rotations; i++) {
            array[i + n - rotations] = temp[i];
        }

        return array;
    }

    // Method to rotate the array to the right using a temporary array (Method 1)
    public static int[] rotateRight(int[] array, int rotations) {
        rotations = rotations % array.length;  // Ensure rotations is within array length

        int n = array.length;  // Length of the array
        int[] temp = new int[rotations];  // Create a temporary array to store elements to be moved

        // Store the last 'rotations' elements in the temporary array
        for (int i = 0; i < rotations; i++) {
            temp[i] = array[i + n - rotations];
        }

        // Shift the preceding elements to the right
        for (int i = n - rotations - 1; i >= 0; i--) {
						System.out.println("array"+"["+i+" + "+rotations+"] = "+"array[" + i+ "]");
            array[i + rotations] = array[i];
        }

        // Place the elements from the temporary array at the beginning of the array
        for (int i = 0; i < rotations; i++) {
            array[i] = temp[i];
        }

        return array;
    }

   public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        System.out.println("Initial array: " + Arrays.toString(array));
        int rotations = 2;  // Number of rotations, you can set this value directly instead of using Scanner
        array = rotateLeft(array, rotations);
        //array = rotateRight(array, rotations);
        System.out.println("Array after " + rotations + " rotations: " + Arrays.toString(array));
    }
}

