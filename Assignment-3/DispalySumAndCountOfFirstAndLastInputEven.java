import java.util.*;
public class DispalySumAndCountOfFirstAndLastInputEven
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int i = sc.nextInt();
		System.out.println("Enter last number:");
		int n = sc.nextInt();
		System.out.println("even number:");
		int count = 0;
		int sum = 0;
		while(i<=n)
		{
			if(i%2==0)
			{
				sum+=i;
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("\n------------------------------");
		System.out.println("Sum of even numbers: "+sum);
		System.out.println("Count of even numbers: "+count);
	}
}