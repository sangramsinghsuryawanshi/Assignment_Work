import java.util.*;
public class DispalySumOfNaturalNumbers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Given natural Numbers 1 To n :");
		int i = 1;
		int sum = 0;
		while(i<=n)
		{	
			System.out.print(" "+i);
			sum+=i;
			i++;
		}
		System.out.println("\n------------------------------");
		System.out.println("Sum of natural numbers: "+sum);
	}
}