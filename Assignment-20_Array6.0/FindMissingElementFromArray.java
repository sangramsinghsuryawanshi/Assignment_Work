import java.util.*;
public class FindMissingElementFromArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size-1];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("\n-----------------------------");
		System.out.print("Given array element is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum+=a[i];			
		}
		int total=size*(size+1)/2;
		System.out.println("\n-----------------------------");
		System.out.print("Missing array element is :"+(total-sum));
		System.out.println("\n-----------------------------");
	}
}

		