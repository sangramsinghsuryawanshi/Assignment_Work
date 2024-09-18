import java.util.*;
public class FactOfGivenNInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n integer number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.print("Factorial f given integer is:"+fact);
		System.out.println("\n----------------------------------------------");
	}
}