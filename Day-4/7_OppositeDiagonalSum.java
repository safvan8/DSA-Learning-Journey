public class OppositeDiagonalSum {
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

        // Calculate the sum of opposite diagonal elements
        int oppositeDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            oppositeDiagonalSum += matrix[i][2 - i]; // Add the opposite diagonal element to the sum
        }

        // Display the sum of opposite diagonal elements
        System.out.println("Sum of opposite diagonal elements: " + oppositeDiagonalSum);
    }
}

