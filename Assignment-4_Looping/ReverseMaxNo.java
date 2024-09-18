import java.util.*;
public class ReverseMaxNo
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		int max=0;
		int rem=0;
		while(no!=0)
		{
			rem=no%10;
			if(rem>max)
			{
				max=rem;
			}
			no=no/10;
		}
		System.out.println("Given max number is :"+max);
	}
}
