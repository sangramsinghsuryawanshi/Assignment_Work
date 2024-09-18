import java.util.*;
public class WhilePrintSumOfIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer :");
		int a = sc.nextInt();
		System.out.println("Given integer is :");
		int i = 1;
		int sum=0;
		while(i<=a)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of integers :"+sum);
	}
}