import java.util.*;
public class WhilePrintSumOfOddIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer :");
		int a = sc.nextInt();
		System.out.println("Given odd integer is :");
		int i = 1;
		int sum = 0;
		while(i<=a)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum+=i;
				
			}
			i++;
		}
		System.out.println("Sum of odd integers :"+sum);

	}
}