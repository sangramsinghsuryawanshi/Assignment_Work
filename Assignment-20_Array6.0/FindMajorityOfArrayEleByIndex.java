import java.util.*;
public class FindMajorityOfArrayEleByIndex
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
                boolean ble=true;
		System.out.println("\n-----------------------------");
		System.out.print("the majority array element is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && ble)
				{
					System.out.print(a[i+2]+" ");
					ble=false;
				}
			}
		}
	System.out.println("\n-----------------------------");
	}
}