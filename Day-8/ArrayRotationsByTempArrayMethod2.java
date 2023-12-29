import java.util.Arrays;

public class ArrayRotationsByTempArrayMethod2 {
	public static int[] rotateLeft(int[] array, int rotations) {
		// Perform left rotation using temp array method-2
		rotations = rotations % array.length;
		int n = array.length;
		int[] temp = new int[n];

		for (int i = 0; i < n; i++) {
			temp[i] = array[(i + rotations) % n];
			System.out.println("temp[" + i + "] = array [(" + i + " + " + rotations + ") % " + n);
		}
		return temp;
	}

	public static int[] rotateRight(int[] array, int rotations) {
		// Perform right rotation using temp array method-2
		rotations = rotations % array.length;
		int n = array.length;
		int[] temp = new int[n];

		for (int i = 0; i < n; i++) {
			temp[(i + rotations) % n] = array[i];
			System.out.println("temp [(" + i + " + " + rotations + ") % " + n + " = temp [" + i + "]");

		}
		return temp;
	}

	public static void main(String[] args) {
		int[] array = { 11, 22, 33, 44, 55 };
		System.out.println("Initial array: " + Arrays.toString(array));

		int rotations = 2; // You can set the number of rotations directly for demonstration
		array = rotateLeft(array, rotations);

		System.out.println("Array after " + rotations + " rotations: " + Arrays.toString(array));
	}
}
