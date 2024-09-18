import java.util.Scanner;

class ArrayProduct
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n1 = s.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("---------------------------------------------");
        for (int i = 0; i < a.length; i++)
        {
            int product = 1;
            for (int j = 0; j < a.length; j++)
            {
                if (i != j)
                {
                    product *= a[j];
                }
            }
            System.out.print(product + " ");
        }
        System.out.println();
    }
}
