import java.util.*;
public class FactorialOfNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		int fact = 1;
		int i=1;
		while(i<=no)
		{
			fact=fact*i;
			System.out.print(i);
			i++;
		}
		System.out.println("\n-------------------------------");
		System.out.println("Factorial of given number :"+fact);
	}
}