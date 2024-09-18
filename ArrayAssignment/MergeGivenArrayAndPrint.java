import java.util.*;
public class MergeGivenArrayAndPrint
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		System.out.println("\n------------------------------");
		System.out.print("\nFirst array element: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n------------------------------");
		System.out.print("\nSecond array element: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		int c[]=new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		System.out.println("\n------------------------------");
		System.out.print("\nMerged array element: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
			System.out.println("\n------------------------------");
	}
}