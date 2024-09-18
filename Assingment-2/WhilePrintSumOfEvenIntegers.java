import java.util.*;
public class WhilePrintSumOfEvenIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer :");
		int a = sc.nextInt();
		System.out.println("Given even integer is :");
		int i = 1;
		int sum = 0;
		while(i<=a)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum+=i;
				
			}
			i++;
		}
		System.out.println("Sum of even integers :"+sum);

	}
}