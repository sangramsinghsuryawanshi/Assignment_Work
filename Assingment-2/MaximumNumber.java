import java.util.*;
public class MaximumNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(+a+",is grater than ,"+b);
		}
		else
		{
			System.out.println(+b+",is greater than,"+a);
		}
	}
}