import java.util.*;
public class PrintPrimeNumAndSumOfTenToTwenty
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
			if(c==2)
			{
				if(i<=13)
				{
					sum+=i;
					System.out.println(i+" ");
				}
			}
		i++;
		}
			System.out.println("\n-----------------------------\nAddition of all prime number is:"+sum);
	}
} 
			
		