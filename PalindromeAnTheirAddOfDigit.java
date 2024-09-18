import java.util.*;
public class PalindromeAnTheirAddOfDigit
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		int temp=n,rem=0,sum=0,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			sum+=rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("Number is palindrome");
			
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		System.out.println("---------------------------------\nAddition is:"+sum);
	}
}
	