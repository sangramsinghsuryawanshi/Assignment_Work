import java.util.*;
public class DivisibleOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		if(a%5==0 && b%11==0)
		{
			System.out.println(+a+",and " +b+",is divisible by 5 and 11");
		}
		else
		{
			System.out.println(+a+",and " +b+",is not divisible by 5 and 11");
		}

	}
}