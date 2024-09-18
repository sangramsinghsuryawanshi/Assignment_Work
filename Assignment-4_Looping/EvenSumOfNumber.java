import java.util.*;
public class EvenSumOfNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		System.out.println("even of given number :");
		int i=1,sum=0;
		while(i<=no)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
				sum+=i;
			}
			i++;
		}
		System.out.println("\n-------------------------------");
		System.out.println(" sum of even number :"+sum);
	}
}