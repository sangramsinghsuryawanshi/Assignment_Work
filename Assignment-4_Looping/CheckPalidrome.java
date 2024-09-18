import java.util.*;
public class CheckPalidrome
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		int rem=0,rev=0,temp=no;
		while(no!=0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev==temp)
		{
			System.out.println("Given  number is palidrome:" +temp);
		}
		else
		{
			System.out.println("Given  number is not palidrome :"+temp);

		}

	}
}