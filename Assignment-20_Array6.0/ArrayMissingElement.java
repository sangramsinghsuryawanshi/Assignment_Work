import java.util.Scanner;

class ArrayMissingElement
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

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("-----------------------");

        boolean ble = true;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > 0)
            {
                for (int j = 0; j < i; j++)
                {
                    if (a[i] != (j + 1) && ble)
                    {
                        System.out.print((j + 1) + " ");
                        ble = false;
                    }
                }
            }
        }
        System.out.println();
    }
}
