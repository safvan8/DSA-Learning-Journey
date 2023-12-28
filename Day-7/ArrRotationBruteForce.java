import java.util.Arrays;

public class ArrRotationBruteForce {

	// Method to perform left rotation on the array
	public static int[] rotateLeft(int[] a, int rotations) {
		rotations = rotations % a.length;
		int temp, prev, i, j;

		// Perform left rotation
		for (i = 0; i < rotations; i++) {
			
			prev = a[0];  // initially, take the 0th elem
				for (j = a.length - 1; j >= 0; j--) {
					System.out.println("Swapping  a[j] :"+a[j] +" with prev:"+prev);
					temp = a[j];
					a[j] = prev;
					prev = temp; // assign a[j] every time to prev
				}
		}
		return a;
	}

	// Method to perform right rotation on the array
	public static int[] rotateRight(int[] array, int rotations) {
		rotations = rotations % array.length;
		int temp, prev, i, j;

		// Perform right rotation
		for (i = 0; i < rotations; i++) {
			prev = array[array.length - 1];
			for (j = 0; j < array.length; j++) {
				temp = array[j];
				array[j] = prev;
				prev = temp;
			}
		}
		return array;
	}

	// Main method
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Initial Array: " + Arrays.toString(array));

		// Number of rotations
		int rotations = 3;

		// Perform right rotation
		array = rotateRight(array, rotations);
		
		System.out.println("Number of rotations: " + rotations);
		System.out.println("Array after right rotation: " + Arrays.toString(array));
	}
}
