import java.util.Scanner;

class ArrayMaxDifference
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

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.print(max - min);
        System.out.println();
    }
}
