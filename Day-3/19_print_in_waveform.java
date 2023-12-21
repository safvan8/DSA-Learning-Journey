import java.util.Arrays;
public class Test
{
    public static void main(String[] args)
    {
        int[] a = {1,5,7,8,6,3,2,4,9};
				Arrays.sort(a);
        System.out.println("original array after sorting: "+Arrays.toString(a));
        for(int i=1;i<a.length;i=i+2)
        {	
					// swap a[i] and a[i+1]
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        System.out.println("in wave form: "+Arrays.toString(a));
    }
}
