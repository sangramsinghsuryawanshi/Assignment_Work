import java.util.*;
public class ReverseMinNo
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		int min=10;
		int rem=0;
		while(no!=0)
		{
			rem=no%10;
			if(rem<min)
			{
				min=rem;
			}
			no=no/10;
		}
		System.out.println("Given min number is :"+min);
	}
}
