import java.util.*;
public class PrimeOfGivenNthInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.print("Given "+n+" number is a prime number");
		}
		else
		{
			System.out.print("Given "+n+" number is not a prime number");
		}		
		System.out.println("\n----------------------------------------------");
	}
}