import java.util.*;
public class EnterArrayEleDisplayIndexAndName
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		String a[]=new String[size];
		System.out.println("\n--------------------------");
		System.out.println("Enter array element name: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("\n--------------------------");
		System.out.println("Index and name is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Index = "+i+" Name = "+a[i]);
		}
		System.out.println("\n--------------------------");
	}
}