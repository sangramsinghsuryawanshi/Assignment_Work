import java.util.*;
public class PrimeNumUptoGivenNthInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("Given prime number "+n+" upto "+n1+" is:");
		System.out.println("-----------------------------");
		for(int i=n;i<=n1;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
				
		System.out.println("\n----------------------------------------------");
	}
}