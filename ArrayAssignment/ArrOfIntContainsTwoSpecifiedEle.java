import java.util.*;
public class ArrOfIntContainsTwoSpecifiedEle
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
		int n=6,n1=7,c=0;
		System.out.println("----------------------------");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n || a[i]==n1)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Array of integer contains two specified numbers");			
		}
		else
		{
			System.out.println("Array of integer not contains two specified numbers");
		}
		System.out.println("----------------------------");
	}
}