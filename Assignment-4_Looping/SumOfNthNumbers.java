import java.util.*;
public class SumOfNthNumbers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given n number:");
		int no = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i<=no)
		{
			System.out.print(" "+i);
			sum=sum+i;
			i++;
		}
		System.out.println("\n------------------------");
		System.out.println("Sum of given number :"+sum);
	}
}