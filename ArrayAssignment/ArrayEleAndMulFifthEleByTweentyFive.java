import java.util.*;
public class ArrayEleAndMulFifthEleByTweentyFive
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("\n--------------------------");
		System.out.print("Enter array element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==4)
			{
				a[i]=a[i]*25;
			}
		}
		System.out.println("\n--------------------------");
		System.out.print("\nFifth array element multiplay by 25 is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}