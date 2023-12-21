public class MaxMatrixElement {
    public static void main(String[] args) {
        // Define the matrix with constants
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Find the maximum element
        int max = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j]; // Update max if a larger element is found
                }
            }
        }

        // Display the maximum element
        System.out.println("Max: " +max);
    }
}
