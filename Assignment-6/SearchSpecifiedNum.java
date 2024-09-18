import java.util.*;
public class SearchSpecifiedNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n digit number:");
		int n = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter Specified number:");
		int n1 = sc.nextInt();
		System.out.println("-------------------------");
		int rem=0,rev=0,count=0;
		do
		{
			rem=n%10;
			n=n/10;
				if(rem==n1)
				{
					count++;
				}
		}while(n!=0);
		System.out.print("Given Specified Number is: "+n1+" And it's count is "+count);
			System.out.println("\n-------------------------");
			
	}
}