import java.util.*;
public class WhilePrintIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer :");
		int a = sc.nextInt();
		System.out.println("Given integer is :");
		int i = 1;
		while(i<=a)
		{
			System.out.println(i);
			i++;
		}
	}
}