public class MatrixMultiplication {
    public static void main(String[] args) {
        // Initializing the 2x2 matrices
        int[][] matrixA = {
            {1, 0},
            {0, 1}
        };
        int[][] matrixB = {
            {1, 2},
            {3, 4}
        };
        int[][] resultMatrix = new int[2][2];

					// Multiplying the matrices using nested loops
			    // Iterate through each row of the resultant matrix
					for (int row = 0; row < 2; row++) {
			        // Iterate through each column of the resultant matrix
					    for (int column = 0; column < 2; column++) {
					        resultMatrix[row][column] = 0;  // Initialize the element of the result matrix to 0
					        for (int inner = 0; inner < 2; inner++) {
					            // Iterate through the 'inner' variable for each corresponding row and column
					            // Perform multiplication for corresponding elements and accumulate the result
					            resultMatrix[row][column] += matrixA[row][inner] * matrixB[inner][column];
					        }
					    }
					}

        // Displaying Matrix A
        System.out.println("Matrix A:");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(matrixA[row][column] + " ");
            }
            System.out.println();
        }

        // Displaying Matrix B
        System.out.println("Matrix B:");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(matrixB[row][column] + " ");
            }
            System.out.println();
        }

        // Displaying the result matrix
        System.out.println("Result Matrix:");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(resultMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}

