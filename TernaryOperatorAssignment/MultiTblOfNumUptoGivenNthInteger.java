import java.util.*;
public class MultiTblOfNumUptoGivenNthInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any for table multiplication number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=10;j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
				
		System.out.println("\n----------------------------------------------");
	}
}