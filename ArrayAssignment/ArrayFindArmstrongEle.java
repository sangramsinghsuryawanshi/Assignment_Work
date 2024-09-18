import java.util.*;
public class ArrayFindArmstrongEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("--------------------------");
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("Orignal array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");
		System.out.print("Armstrong array element:");
		for(int i=0;i<a.length;i++)
		{
			int c=0,rem=0,rev=0;
			int temp=a[i];
			for(;temp!=0;temp=temp/10)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
			}
				if(rev==a[i])
				{
					System.out.print(a[i]+" ");
				}
		}
		System.out.println("\n--------------------------");

	}
}
