import java.util.*;
public class PalindromeAnTheirAddOfDigitAndAverage
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		int temp=n,rem=0,sum=0,rev=0;
		double avg=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			sum+=rem;
			avg=sum/3;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("Addition is:"+sum);
			System.out.println("---------------------------------");
			System.out.println("Number is palindrome");
			
		}
		else
		{
			System.out.println("Average is:"+avg);
			System.out.println("---------------------------------");
			System.out.println("Number is not palindrome");
		}
		
	}
}
	