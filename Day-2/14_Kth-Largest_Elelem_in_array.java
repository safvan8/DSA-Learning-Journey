import java.util.*;

public class Test {
    public static void main(String[] args) {
       // Create an array of size n to store the elements
       int[] a = {5,4,9,3,6};
        
        // Print the original array
        System.out.println(Arrays.toString(a));
        int n = a.length;
            
        // Sort the array in asc  order using selection Sort algorithm first
        for (int i=0; i<n-1 ; i++) {
            for (int j=i+1; j<n ; j++) {
                // Compare adjacent elements , sort  in asc
                if (a[i] > a[j]) {
                    // Swap the elements if they are in the wrong order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

		// Print the sorted array
        System.out.println("After sorting: " + Arrays.toString(a));

	    Scanner obj = new Scanner(System.in);

		System.out.println("Enter k value: ");
        int k = obj.nextInt();

		// to apply  K-1 , array must be sorted First
        System.out.println(k+"th largest element: "+a[n-k]);
        
    }
}
