import java.util.Arrays;

public class SortMatrixColWiseAsc {
    public static void main(String[] args) {
        // Define the original matrix with constants
        int[][] matrix = {{1, 3, 2}, {7, 0, 5}, {3, 5, 4}};

        // Display the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matrix[i][j] + " "); // Print each element in the row
            }
            System.out.println(); 
        }

        // Transpose the matrix
        int[][] transposedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                transposedMatrix[i][j] = matrix[j][i]; // Swap rows and columns to get the transposed matrix
            }
        }
        // Display the transposed matrix
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
               System.out.print(transposedMatrix[i][j] + " "); // Print each element in the row
            }
            System.out.println(); 
        }

        // Sort each row of the transposed matrix
        for (int i = 0; i < 3; i++) { // Iterate over each row
            Arrays.sort(transposedMatrix[i]); // Sort each row in ascending order
        }
				// Display the transposed matrix after sorting
        System.out.println("Transposed Matrix after sorting in ascending order: ");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
               System.out.print(transposedMatrix[i][j] + " "); // Print each element in the row
            }
            System.out.println(); 
        }
				
        // Transpose again  the sorted transposed matrix to get the final result
        int[][] updatedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) { // Iterate over each row
            for (int j = 0; j < 3; j++) { // Iterate over each column
                updatedMatrix[i][j] = transposedMatrix[j][i]; // Swap rows and columns to get the updated matrix
            }
        }

        // Display the updated matrix
        System.out.println("Transposed Matrix after sorting in asc, Transposed once more: ");
        for (int i = 0; i < 3; i++) { // Iterate over each row
            for (int j = 0; j < 3; j++) { // Iterate over each column
                System.out.print(updatedMatrix[i][j] + " "); // Print each element in the row
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
