import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter 9 elements: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
