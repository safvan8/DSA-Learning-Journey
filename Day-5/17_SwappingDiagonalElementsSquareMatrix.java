public class SwappingDiagonalElementsSquareMatrix
{
    public static void main(String[] args)
    {
        // Initializing the original matrix
        int[][] originalMatrix = {
            {1, 2, 3, 4},
            {5, 5, 5, 5},
            {5, 6, 7, 8},
            {6, 7, 8, 9}
        };

        // Displaying the original matrix
        System.out.println("Original Matrix: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(originalMatrix[i][j]+" ");
            }
            System.out.println();
        }

        // Swapping the diagonal elements
        for(int i=0; i<4; i++)
        {
            int temp = originalMatrix[i][i];
            originalMatrix[i][i] = originalMatrix[i][3-i];
            originalMatrix[i][3-i] = temp;
        }

        // Displaying the updated matrix
        System.out.println("Updated Matrix: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(originalMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

