public class ColumnSwap {
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

        // Prompt user for column values to swap
        int colX = 0; // column to swap
        int colY = 2; // with column

        // Swap the columns
        for (int i = 0; i < 4; i++) {
            int temp = matrix[i][colX];
            matrix[i][colX] = matrix[i][colY];
            matrix[i][colY] = temp;
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

