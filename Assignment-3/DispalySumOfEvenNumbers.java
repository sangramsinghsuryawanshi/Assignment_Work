import java.util.*;
public class DispalySumOfEvenNumbers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Enter given number:");
		int i = sc.nextInt();
		System.out.println("Given even Numbers 1 To n :");
		int sum = 0;
		while(i<=n)
		{	
			if(i%2==0)
			{
				sum+=i;
				System.out.println(i);
			}
			i++;

		}
		System.out.println("\n------------------------------");
		System.out.println("Sum of even numbers: "+sum);
	}
}