import java.util.*;
public class FindFristRepeatingArrayEleByIndex
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
		System.out.print("the index of first repeating element is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && ble)
				{
					System.out.print(a[i]+" ");
					ble=false;
				}
			}
		}
	System.out.println("\n-----------------------------");
	}
}