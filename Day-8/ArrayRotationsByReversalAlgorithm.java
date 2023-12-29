import java.util.Arrays;

public class ArrayRotationsByReversalAlgorithm {
    // Reverses the elements in the array between the indices low and high
    private static void reverse(int[] array, int low, int high) {
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

    // Rotates the array to the left by 'rotations' positions using the reversal algorithm
    public static int[] rotateLeft(int[] array, int rotations) {
        rotations = rotations % array.length;
        reverse(array, 0, rotations - 1); // Reverse the first part of the array
        reverse(array, rotations, array.length - 1); // Reverse the second part of the array
        reverse(array, 0, array.length - 1); // Reverse the entire array again
        return array;
    }

    // Rotates the array to the right by 'rotations' positions using the reversal algorithm
    public static int[] rotateRight(int[] array, int rotations) {
        rotations = rotations % array.length;
        reverse(array, 0, array.length - 1); // Reverse the entire array
        reverse(array, 0, rotations - 1); // Reverse the first part of the array
        reverse(array, rotations, array.length - 1); // Reverse the second part of the array
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Initial array: " + Arrays.toString(array));

        int rotations = 2;  // You can set the number of rotations directly for demonstration
        array = rotateLeft(array, rotations);

        System.out.println("Array after " + rotations + " rotations: " + Arrays.toString(array));
    }
}

