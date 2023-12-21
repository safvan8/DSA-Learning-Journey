import java.util.Arrays;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
	    int[] a = {1,2,3,4,5,6,7,8,9};
	    System.out.println("Original array: " + Arrays.toString(a));
			
			int low=0, high = a.length-1;
			while (low <= high)
			{
				// swap low and high
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
	
				low++;
				high--;
			}
			System.out.println("after swapping: " + Arrays.toString(a));
	}
}
