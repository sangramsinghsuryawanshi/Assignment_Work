import java.util.*;
public class InitiliseAnArrayEleAndPrint
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int a[]={1,54,36,54,22,11};
		System.out.println("\n--------------------------");
		System.out.print("\nInitialized array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}