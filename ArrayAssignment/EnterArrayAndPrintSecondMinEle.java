import java.util.*;
public class EnterArrayAndPrintSecondMinEle
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
		int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && smin!=min)
			{
				smin=a[i];
			}
		}
		System.out.println("\n--------------------------");
		System.out.print("Second min array element is: "+smin);	
		System.out.println("\n--------------------------");
	}
}