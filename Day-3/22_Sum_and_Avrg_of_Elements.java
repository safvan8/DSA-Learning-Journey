import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // Constants
        final int[] ARRAY = {1, 2, 3, 4, 5}; // Defined array elements
        final int ARRAY_SIZE = ARRAY.length; // Size of the array

        // Printing the array
        System.out.println(Arrays.toString(ARRAY));

        // Calculating the sum of array elements
        int sum = 0;
        for(int item : ARRAY) {
            sum = sum + item;
        }
        System.out.println("Sum: " + sum);

        // Calculating the average of array elements
        double average = (double)sum / ARRAY_SIZE;
        System.out.println("Avg: " + average);
    }
}

