import java.util.*;
public class InputTwoArrayEleAndMergeInThirdEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[a.length+b.length];
		System.out.println("\n--------------------------");
		System.out.print("Enter first array element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("Enter second array element : ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
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
		System.out.println("\n--------------------------");
		System.out.print("\nMerge of two array element is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}