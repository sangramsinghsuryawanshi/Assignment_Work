import java.util.*;
public class DispalySumOfOddlNumbers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Given odd Numbers 1 To n :");
		int i = 1;
		int sum = 0;
		while(i<=n)
		{	
			if(i%2!=0)
			{
				System.out.print(" "+i);
				sum+=i;
			}
			i++;
		}
		System.out.println("\n------------------------------");
		System.out.println("Sum of odd numbers: "+sum);
	}
}