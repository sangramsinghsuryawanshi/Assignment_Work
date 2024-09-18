import java.util.*;
public class EvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println(+a+",is even number");
		}
		else
		{
			System.out.println(+a+",is odd number");
		}

	}
}