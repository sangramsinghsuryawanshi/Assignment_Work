import java.util.*;
public class MultipleInputSumOfNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------");
		int sum = 0;
		int i=-1;
		while(i!=0)
		{
			System.out.println("Enter given n number(Press 0 to terminate the while loop):");
			i = sc.nextInt();
			sum=sum+i;
		}
		System.out.println("\n------------------------");
		System.out.println("Sum of given number :"+sum);
	}
}