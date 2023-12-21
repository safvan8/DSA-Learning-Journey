import java.util.Arrays;

public class SortMatrixRowWiseAsc {
    public static void main(String[] args) {
        // Define the original matrix with constants
        int[][] matrix = {{2, 1, 5}, {9, 3, 7}, {3, 2, 1}};

        // Display the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Sort each row of the matrix in ascending order
        for (int i = 0; i < 3; i++) {
            System.out.println("sorting array : "+Arrays.toString(matrix[i]));
            Arrays.sort(matrix[i]); //sorting each row of matrix seperately.
        }

        // Display the updated matrix
        System.out.println("Updated Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
