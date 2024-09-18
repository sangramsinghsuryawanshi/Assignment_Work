import java.util.*;
public class ReverseNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		int rem=0,rev=0;
		while(no!=0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println("Given reverse number is :" +rev);
	

	}
}