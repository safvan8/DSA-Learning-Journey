public class MatrixSubtraction
{
    public static void main(String[] args)
    {
        // Initializing the matrices
        int[][] matrixA = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        int[][] matrixB = {
            {2, 2, 2},
            {3, 3, 3},
            {4, 4, 4}
        };
        int[][] resultMatrix = new int[3][3];

        // Subtracting the matrices
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                // Performing subtraction for corresponding elements and storing in the result matrix
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        // Displaying Matrix A
        System.out.println("Matrix A:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }

        // Displaying Matrix B
        System.out.println("Matrix B:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(matrixB[i][j]+" ");
            }
            System.out.println();
        }

        // Displaying the result matrix
        System.out.println("Result Matrix:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

