import java.util.*;
public class FindSmallestMissingArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		System.out.print("Missing smallest array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				System.out.print(i);
				break;
			}
		}
	System.out.println("\n----------------------");	
	}
}