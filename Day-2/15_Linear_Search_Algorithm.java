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
        System.out.println("Enter key value to search: ");
        int key = obj.nextInt();

		// linear search
        int index = -1;
		for (int i=0;i<n ; i++ )
		{
			if (a[i] == key)
			{
				index =  i ;
				break;
			}
		}

		System.out.println("Location :"+ index );
	}
}