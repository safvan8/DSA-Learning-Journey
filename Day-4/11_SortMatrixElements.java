import java.util.Arrays;

public class SortMatrixElements {
    public static void main(String[] args) {
        // Define the original matrix with constants
        int[][] matrix = {{2, 1, 9}, {4, 8, 0}, {3, 7, 5}};

        // Display the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Flatten the matrix into a 1D array and sort it
        int[] tempArray = new int[matrix.length * matrix[0].length];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempArray[k++] = matrix[i][j];
            }
        }
        Arrays.sort(tempArray);

        // Reconstruct the matrix with sorted elements
        k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = tempArray[k++];
            }
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

