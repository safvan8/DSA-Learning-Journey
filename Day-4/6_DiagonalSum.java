public class DiagonalSum {
    public static void main(String[] args) {
        // Define the matrix with elements as constants
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Calculate the sum of diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix[i][i]; // Add the diagonal element at index [i][i] to the sum , (0,0) , (1,1) , (2,2)
        }

        // Display the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
