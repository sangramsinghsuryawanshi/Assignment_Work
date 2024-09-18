import java.util.*;
public class ReplaceArrZeroWithOne
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
		System.out.println("Enterd  odd element:");
		int sum=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);			
		}

		System.out.println("----------------------------");
	}
}