import java.util.Arrays;

public class ArrayElementDeleteSpecifiedFirstOccur {

	public static void main(String[] args) {
		int[] originalArray = { 10, 22, 33, 11, 22, 44, 11, 55, 11, 66, 11, 77, 88, 11, 99 };
					        //        0   1   2   3   4   5   6   7   8   9   10  11  12  13  14

		originalArray = deleteFirstOcc(originalArray, 11); // Delete the first occurrence of 11
		System.out.println(Arrays.toString(originalArray)); // Output: 10 22 33 22 44 11 55 11 66 11 77 88 11 99
	}

		// Method to delete the first occurrence of a specific element
		public static int[] deleteFirstOcc(int[] inputArray, int element) {
				int[] newArray = new int[inputArray.length - 1];
				int location = -1;
		
				// linear search to capture the first occurence location of the element
				for (int i = 0; i < inputArray.length; i++) {
					if (element == inputArray[i]) {
						location = i;
						break; // Store the location and exit the loop if the element is found
					}
				}
		
				if (location != -1) {
					newArray = deleteAtLocation(inputArray, location); // Delete the element at the found location
				} else {
					return inputArray; // Return the original array if the element is not found
				}
		
				return newArray; // Return the updated array
		}

		// Method to delete an element at a specified location
		private static int[] deleteAtLocation(int[] inputArray, int location) {
					int[] newArray = new int[inputArray.length - 1];
			
					if (location < 0 || location >= inputArray.length) {
						return inputArray; // Return the original array if the location is invalid
					}
			
					for (int i = 0, j = 0; i < inputArray.length; i++) {
						if (i != location) {
							newArray[j++] = inputArray[i];
						}
					}
				return newArray; // Return the updated array
		}

}
