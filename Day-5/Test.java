public class MatrixRotation {
    public static void main(String[] args) {
        // Define the original matrix with initialized values
       final int[][] originalMatrix = {
						{1, 2, 3},
						{4, 5, 6}, 
						{7, 8, 9}
				};

        // Create a new matrix to store the rotated values
        int[][] rotatedMatrix = new int[3][3];

        // Display the original matrix
        System.out.println("Original Matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Copy the original matrix to a temporary matrix
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                rotatedMatrix[i][j] = originalMatrix[i][j];
            }
        }

        // Transpose the matrix and perform the rotation
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                rotatedMatrix[i][j] = originalMatrix[j][i];
            }
        }

        // Reverse the row values to obtain the final rotated matrix
        System.out.println("Rotated Matrix:");
        for(int i=3-1; i>=0; i--) {
            for(int j=0; j<3; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}