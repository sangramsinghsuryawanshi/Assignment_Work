import java.util.*;
public class PalindromeBetweenTwoGivenNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number :");
		int first = sc.nextInt();
		System.out.print("-----------------------------------------\n");	
		System.out.print("Enter Last number :");
		int last = sc.nextInt();	
		System.out.print("-----------------------------------------\n");
		System.out.print("Palindrome number "+first+" To "+last+" is \n");
		System.out.print("-----------------------------------------\n");
		int i=first;
		while(i<=last)
		{
				int j=i;
			int rem=0,rev=0,temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}
			if(rev==j)
			{
				System.out.print(rev+" ");
			}
			i++;
		}
	}
}