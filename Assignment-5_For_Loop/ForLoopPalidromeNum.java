import java.util.Scanner;
public class ForLoopPalidromeNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,rem=0,sum=0,count=0;
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		int temp=n;
		for(int i=n;i!=0; i=i/10)//for(;n!=0;)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("Reverse of given number is: "+rev);
		System.out.println("--------------------");
			if(temp==rev)
			{
				System.out.println("number is palindrome:");
			}
			else
			{
				System.out.println("number is not palindrome:");
			}
		System.out.println("--------------------");
		
	}
}
