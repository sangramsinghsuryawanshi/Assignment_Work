import java.util.*;

public class FindMaxDiffrenceBetwwenTwoEleInArray
{
    public static void main(String[] ar)
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
        System.out.println("------------------------------");

        for (int i = 0; i < a.length - 2;)
        {
            if (a[i] > a[i + 1])
            {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            if (a[i + 2] > a[i + 1])
            {
                int temp = a[i + 1];
                a[i + 1] = a[i + 2];
                a[i + 2] = temp;
            }
            i = i + 2;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
