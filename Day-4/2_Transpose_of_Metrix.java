public class MatrixTranspose {
    public static void main(String[] args) {
        // Define matrix size and elements
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display original matrix
        System.out.println("Original Matrix: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        // Calculate and display transpose matrix
        System.out.println("Transpose Matrix: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

