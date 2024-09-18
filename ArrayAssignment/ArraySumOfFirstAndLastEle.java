import java.util.*;
public class ArraySumOfFirstAndLastEle
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
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0 || i==a.length-1)
			{
				sum+=a[i];
			}
		}

		System.out.println("----------------------------");
		System.out.print("Sum of first and last element:"+sum);
		System.out.println("\n----------------------------");
	}
}