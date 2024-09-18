import java.util.*;
public class ArrPrintSquareOfEleInEvenPosi
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
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				a[i]=a[i]*a[i];
			}
		}
		System.out.println("square of the element which is on even position is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("----------------------------");
	}
}