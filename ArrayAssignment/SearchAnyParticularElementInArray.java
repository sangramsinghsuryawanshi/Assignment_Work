import java.util.*;
public class SearchAnyParticularElementInArray
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
		System.out.println("Search  specific array element:");
		int n=sc.nextInt();
		System.out.println("----------------------------");
		System.out.println("Searched specific array element is:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println(a[i]);			
			}
		}
		System.out.println("----------------------------");
	}
}