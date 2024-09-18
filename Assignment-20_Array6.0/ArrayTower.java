import java.util.Scanner;

class ArrayTower
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Size Of array:");
        int n1 = s.nextInt();
        int[] a = new int[n1];

        System.out.println("Enter array:");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = 0;

        System.out.println("Enter The Value K:");
        int k = s.nextInt();
        System.out.println("------------------");

        for (int i = 0; i < a.length; i++)
        {
            int temp = 0;
            if ((a[i] - k) > 0)
            {
                temp = a[i] - k;
            }
            else
            {
                temp = a[i] + k;
            }

            if (temp > max)
            {
                max = temp;
            }

            if (temp < min)
            {
                min = temp;
            }
        }

        System.out.println((max - min));
        System.out.println();
    }
}
