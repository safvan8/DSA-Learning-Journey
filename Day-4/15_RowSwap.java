public class RowSwap {
    public static void main(String[] args) {
        // Define the matrix as constants (4x4 matrix)
        int[][] matrix = new int[4][4];
        // Assign values to the matrix
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 5, 5, 5};
        matrix[2] = new int[]{7, 8, 9, 5};
        matrix[3] = new int[]{2, 2, 2, 2};

        // Display original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Prompt user for row values to swap
        int rowX = 0; // row to swap
        int rowY = 2; // with row

        // Swap the rows
        for (int i = 0; i < 4; i++) {
            int temp = matrix[rowX][i];
            matrix[rowX][i] = matrix[rowY][i];
            matrix[rowY][i] = temp;
        }

        // Display updated matrix
        System.out.println("Updated Matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
   }
}

