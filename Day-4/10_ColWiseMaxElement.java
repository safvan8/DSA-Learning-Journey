public class ColWiseMaxElement {
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

        // Find the column-wise maximum elements
        int max;
        for (int i = 0; i < 3; i++) {
            max = matrix[0][i];  // Initialize max with the first element of the column
            for (int j = 0; j < 3; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i]; // Update max if a larger element is found in the column
                }
            }
            System.out.println("Col: " + i + " ==> " + max);  // Display the maximum element of the current column
        }
    }
}


