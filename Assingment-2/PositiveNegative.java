import java.util.*;
public class PositiveNegative
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.println(+a+",Number is positive");
		}
		else if(a<0)
		{
			System.out.println(+a+",Number is Negative");
		}
		else
		{
			System.out.println(+a+",Number is Zero");
		}

	}
}