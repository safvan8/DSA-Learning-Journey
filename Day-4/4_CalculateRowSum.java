public class CalculateRowSum {
    public static void main(String[] args) {
        // Define the matrix and its elements (constants) , 3x3 matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // Calculate the row-wise sum of elements
        for(int i=0; i<3; i++) {
            int rowSum = 0;
            for(int j=0; j<3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println(i + " Row sum: " + rowSum);
        }
    }
}
