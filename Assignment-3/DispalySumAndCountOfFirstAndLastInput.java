import java.util.*;
public class DispalySumAndCountOfFirstAndLastInputOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int i = sc.nextInt();
		System.out.println("Enter last number:");
		int n = sc.nextInt();
		System.out.println("odd number:");
		int count = 0;
		int sum = 0;
		while(i<=n)
		{
			if(i%2!=0)
			{
				sum+=i;
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("\n------------------------------");
		System.out.println("Sum of odd numbers: "+sum);
		System.out.println("Count of odd numbers: "+count);
	}
}