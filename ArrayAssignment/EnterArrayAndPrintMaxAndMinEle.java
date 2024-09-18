import java.util.*;
public class EnterArrayAndPrintMaxAndMinEle
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
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("\n--------------------------");
		System.out.print("Max array element is: "+max);	
		System.out.println("\n--------------------------");
		System.out.print("Min array element is: "+min);	
		System.out.println("\n--------------------------");
	}
}