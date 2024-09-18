import java.util.*;
public class PrintPalindromeNumToNNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int first = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter Last number:");
		int last = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Palindrome number "+first+" To "+last+" is :");
		System.out.println("-------------------------");
		int i=first;
		do
		{
			int rem=0,rev=0,temp=i;
			do
			{
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}while(temp!=0);
			if(rev==i)
			{
				System.out.print(" "+rev);
			}
		i++;
		}while(i<=last);
		System.out.println("\n-------------------------");
	}
}