import java.util.*;
public class ArrayEleAndItsAverage
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("\n--------------------------");
		System.out.print("Enter array element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("\n--------------------------");
		System.out.print("\nGiven array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum+=a[i];
		}
		System.out.println("\n--------------------------");
		System.out.print("\n Average of given array element is: "+(sum/size));
		System.out.println("\n--------------------------");
	}
}