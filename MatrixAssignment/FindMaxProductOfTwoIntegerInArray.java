import java.util.*;
public class FindMaxProductOfTwoIntegerInArray
{
	public static void main(String[]ar)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size= sc.nextInt();
		System.out.println("\n------------------------");
		int a[]= new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n------------------------");
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && smax!=max)
			{
				smax=a[i];
			}
		}
		System.out.print("maximum product of two integers: "+(max*smax));
		System.out.println("\n-----------------------------");
	}
}
