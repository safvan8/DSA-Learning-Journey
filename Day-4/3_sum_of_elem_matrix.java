public class CalculateMatrixSum {
    public static void main(String[] args) {
        // Define the matrix and its elements (constants)
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        // Calculate the sum of elements
        int sum = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}

