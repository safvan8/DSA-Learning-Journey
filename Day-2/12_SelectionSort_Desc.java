import java.util.*;

public class Test {
    public static void main(String[] args) {
       // Create an array of size n to store the elements
       int[] a = {5,4,2,8,1};
        
        // Print the original array
        System.out.println(Arrays.toString(a));
        int n = a.length;
            
        // Sort the array in desc order using selection Sort algorithm
        for (int i=0; i<n-1 ; i++) {
            for (int j=i+1; j<n ; j++) {
                // Compare adjacent elements , sort  in desc
                if (a[i] < a[j]) {
                    // Swap the elements if they are in the wrong order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Print the sorted array
        System.out.println("After sorting: " + Arrays.toString(a));
    }
}
