import java.util.Arrays;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for(int i=0;i<n;i++)
            a[i] = obj.nextInt();
        System.out.println(Arrays.toString(a));
        int low=0,high=a.length-1;
        
				// when low = high, this loop will add same elements to print double [in case of array with odd no.of elements].
				while(low<=high)
        {
            System.out.print((a[low]+a[high])+" ");
            low++; // increasing the low pointer
            high--;// decreasing high pointer
        }
    }
}