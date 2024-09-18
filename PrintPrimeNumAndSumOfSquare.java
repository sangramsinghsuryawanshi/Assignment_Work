import java.util.*;
public class PrintPrimeNumAndSumOfSquare
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("----------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("----------------------");
		int i=n,sum=0;
		while(i<=n1)
		{
			int j=1,c=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
				j++;
			}
			int rem=i*i;
			if(c==2)
			{
				sum+=rem;
				System.out.println(i+" * "+i+" = "+rem);
			}
		i++;
		}
			System.out.println("\n-----------------------------\nAddition of all square prime number is:"+sum);
	}
} 
			
		