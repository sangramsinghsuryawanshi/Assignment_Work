import java.util.*;
public class PalindromeNumCheck
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		int rem=0,temp=n,rev=0;
		for(;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
		}
		if(rev==n)
		{
			System.out.print("Given "+n+" number is a palindrome");
		}
		else
		{
			System.out.print("Given "+n+" number is not a palindrome");
		}		
		System.out.println("\n----------------------------------------------");
	}
}