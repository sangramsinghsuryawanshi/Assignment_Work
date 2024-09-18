import java.util.*;
public class ArrayEvenPosiCoutAndSum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("----------------------------");
		int a[]=new int[size];
		System.out.println("Enter elements for array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("----------------------------");
		System.out.println("Enterd element present at even position:");
		int sum=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]);
				c++;
				sum+=a[i];
			}
		}
		System.out.println("----------------------------");
		System.out.print("Sum of element present at even position:"+sum);
		System.out.print("\nCount of element present at even position:"+c);
		System.out.println("\n----------------------------");
	}
}