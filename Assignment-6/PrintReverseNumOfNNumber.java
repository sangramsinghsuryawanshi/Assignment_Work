import java.util.*;
public class PrintReverseNumOfNNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Reverse number "+n+" is :");
		System.out.println("-------------------------");
		int rem=0,rev=0;
		do
		{
			rem=n%10;
			n=n/10;
		System.out.print(" "+rem);
		}while(n!=0);
		
	}
}