import java.util.*;
public class EnterArrayAndPrintSecondMaxEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("\n--------------------------");
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && smax!=0)
			{
				smax=a[i];
			}
		}
		System.out.println("\n--------------------------");
		System.out.print("Second max array element is: "+smax);	
		System.out.println("\n--------------------------");
	}
}