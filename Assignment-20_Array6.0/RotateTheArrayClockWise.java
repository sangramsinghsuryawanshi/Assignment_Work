import java.util.*;
public class RotateTheArrayClockWise
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println("\n-----------------------------");
		System.out.print("Clock Wise rotation of array element :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");			
		}
		System.out.println("\n-----------------------------");
	}
}

		