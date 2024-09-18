import java.util.*;
public class FindRepeatativeEleFromArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		System.out.print("The repetitive array element is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println("\n----------------------");
	}
}