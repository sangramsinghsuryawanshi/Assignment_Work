import java.util.*;
public class ArrInputTenEleAndMulFithEleByTweentyFive
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
			if((i+1)==5)
			{
				a[i]=a[i]*25;
			}
		}
		System.out.println("multiply 5th elements by 25 is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("----------------------------");
	}
}