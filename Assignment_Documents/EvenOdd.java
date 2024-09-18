import java.util.*;
public class EvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number :");
		int a = sc.nextInt();
		System.out.println("--------------------------");
		int rem=0;
		int rev=0;
		int sum=0;
		int sum1=0;
		while(a!=0)
		{
			rem=a%10;
			if(a%2==0)
			{
				System.out.println(rem);
				sum+=rem;
			}
			a=a/10;
		}
		System.out.println("--------------------------");
		System.out.println("Sum of Even number :"+sum);
		System.out.println("Enter given number :");
		int b = sc.nextInt();
		System.out.println("\n--------------------------");
		while(b!=0)
		{
			rev=b%10;
			 if(b%2!=0)
			{
				System.out.println(rev);
				sum1=sum1+rev;
			}
			b=b/10;
		}
		System.out.println("\n--------------------------");
		System.out.println("Sum of Even number :"+sum1);
	}
}