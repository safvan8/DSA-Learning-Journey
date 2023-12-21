public class CalculateColumnSum {
    public static void main(String[] args) {
        // Define the matrix and its elements (constants)
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // Calculate the column-wise sum of elements
        for(int i=0; i<3; i++) {
            int colSum = 0;
            for(int j=0; j<3; j++) {
                colSum += matrix[j][i];
            }
            System.out.println(i + " Col sum: " + colSum);
        }
     }
}

