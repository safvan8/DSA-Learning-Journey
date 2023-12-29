import java.util.Arrays;

public class ArrayRotationsByTempVariable {
    // Method to rotate the array to the left using a temporary variable
    public static int[] rotateLeft(int[] array, int rotations) {
        rotations = rotations % array.length;
        int temp;
        for (int i = 0; i < rotations; i++) {

            temp = array[0]; // Store the first element of the array in the temporary variable
            // Shift each element one position to the left
						for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;// Place the originally first element (stored in temp) at the end of the array
        }
        return array;
    }

    // Method to rotate the array to the right using a temporary variable
    public static int[] rotateRight(int[] array, int rotations) {
        rotations = rotations % array.length;
        int temp;
        for (int i = 0; i < rotations; i++) {
            temp = array[array.length - 1]; // save the last element in temp
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];// Shift each element one position to the Right
            }
            array[0] = temp; // assign the temp
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        System.out.println("Initial array: " + Arrays.toString(array));
        int rotations = 2;  // Number of rotations, you can set this value directly instead of using Scanner
        // array = rotateLeft(array, rotations);
        array = rotateRight(array, rotations);
        System.out.println("Array after " + rotations + " rotations: " + Arrays.toString(array));
    }
}

