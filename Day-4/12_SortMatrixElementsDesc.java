import java.util.Arrays;

public class SortMatrixElementsDesc {
    public static void main(String[] args) {
        // Define the original matrix with constants
        int[][] matrix = {{5, 4, 2}, {9, 0, 7}, {3, 6, 1}};

        // Display the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Flatten the matrix into a 1D array and sort it in ascending order
        int[] tempArray = new int[9];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempArray[k++] = matrix[i][j];
            }
        }
        Arrays.sort(tempArray);

        // Reconstruct the matrix with sorted elements in descending order
        k = 8;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = tempArray[k--];
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

